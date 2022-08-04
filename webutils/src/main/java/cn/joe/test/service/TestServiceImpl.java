package cn.joe.test.service;

import cn.joe.test.annotations.TestAnnotationUse;
import cn.joe.test.dao.TestMapper;
import cn.joe.test.model.Student;
import cn.joe.test.util.TestUtil;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 测试
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/2/20 18:14
 * <p>
 * ------------------------------------------------------------------------
 **/

public class TestServiceImpl implements TestService {
  @Autowired
  private ApplicationContext applicationContext;
  @Autowired
  private TestMapper testMapper;
  @Autowired
  private TestAnnotationUse annotationUse;
  @Autowired
  private TestUtil testUtil;

  @Override
  public List<String> listAll() {
    /*annotationUse.main();
    Student student = testMapper.getOneStudent(1);*/
    return testMapper.getAll();
  }

  @Override
  public Student getOneStudent(Integer id) {
    return testMapper.getOneStudent(id);
  }

  @Override
  public final int insert(Student student) throws Exception {
    //testMapper.insert(student);
    return insertOne(student);
  }

  @Override
  public int insertOne(Student student) throws Exception {
    return -1;
  }

  @Override
  @Transactional
  public int batchInsert(List<Student> studentList) {
    //parallelStreamInsert(studentList);//多线程，线程号会重复，但是不会回滚；实际应该为主线程中断，并非所有数据都插入
    //concurrentInsert(studentList);//多线程，不会回滚
    //transactionManagerInsert(studentList);//单线程回滚，多线程不回滚
    transactionTemplateInsert(studentList);
    return 0;
  }

  //@Transactional
  void parallelStreamInsert(List<Student> studentList){
    studentList.parallelStream().forEach(student ->
    {
      testUtil.insert(student);
      System.out.println("当前线程号为：" + Thread.currentThread().getId());
    }); //子线程异常，可能会出现不回滚的现象
  }

  //@Transactional
  void concurrentInsert(List<Student> studentList){
    ThreadPoolExecutor executor = new ThreadPoolExecutor
        (200, 300, 10, TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<Runnable>(studentList.size()));
    for (Student student : studentList) {
      Runnable r = () -> {
        testUtil.insert(student);
        System.out.println("当前线程号为：" + Thread.currentThread().getId());
      };
      executor.execute(r);
    }
    executor.shutdown(); //子线程异常不会回滚
  }

  //开启多线程不会回滚，单线程会回滚
  private void transactionManagerInsert(List<Student> studentList){
    PlatformTransactionManager transactionManager = applicationContext
        .getBean(PlatformTransactionManager.class);
    DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
    defaultTransactionDefinition
        .setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    transactionManager.getTransaction(defaultTransactionDefinition);

    TransactionStatus transactionStatus = transactionManager.getTransaction(defaultTransactionDefinition);
    try{
      ThreadPoolExecutor executor = new ThreadPoolExecutor
          (200, 300, 10, TimeUnit.MILLISECONDS,
              new ArrayBlockingQueue<Runnable>(studentList.size()));
      for (Student student : studentList) {
        Runnable r = () -> {
          System.out.println("当前线程号为：" + Thread.currentThread().getId());
          testUtil.insert(student,null);
          //System.out.println(testMapper.getOneStudent(student.getId()));//至此处，事务生效，
          // 说明Transational标注的方法调用其他方法，事务可生效；其他方法调用Transactional标注方法，事务不生效
        };
        executor.execute(r);
      }
    }catch (Exception e){
      System.out.println("发生了异常"+e.getMessage());
      transactionManager.rollback(transactionStatus);
    }
  }

  void transactionTemplateInsert(List<Student> studentList){
    PlatformTransactionManager transactionManager = applicationContext
        .getBean(PlatformTransactionManager.class);
    TransactionTemplate transactionTemplate = new TransactionTemplate();
    transactionTemplate.setTransactionManager(transactionManager);
    ObjectUtils.isEmpty(0);
    Optional.ofNullable(0).orElse(0);
    transactionTemplate.execute(new TransactionCallback<Object>() {
      @Override
      public Object doInTransaction(TransactionStatus status) {
        Object result = new Object();
        ThreadPoolExecutor executor = new ThreadPoolExecutor
            (200, 300, 10, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(studentList.size()));
        try {
          for (Student student : studentList) {
            Runnable r = new Runnable() {
              @Override
              public void run() {
                try{
                  testUtil.insert(student);
                }catch (Exception e){
                  status.setRollbackOnly();
                }
                System.out.println("当前线程号为：" + Thread.currentThread().getId());
              }
            };
            executor.execute(r);
          }
        } catch (Exception e) {
          //status.setRollbackOnly();
          //result = e;
          System.out.println("主线程捕获到异常");
        }
        executor.shutdown();
        return result;
      }
    });
  }

  @Test
  public void test(){
    if(ObjectUtils.isEmpty(new Integer(0))){
      System.out.println(0);
    }else{
      System.out.println(1);
    }
  }
}
