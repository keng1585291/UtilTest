package cn.joe.test.service;

import cn.joe.test.annotations.TestAnnotation;
import cn.joe.test.annotations.TestAnnotationUse;
import cn.joe.test.dao.TestMapper;
import cn.joe.test.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/4/1 13:53
 * <p>
 * ------------------------------------------------------------------------
 **/
@Service
public class TestServiceDeriveImpl extends TestServiceImpl implements TestService{
  @Autowired
  private TestMapper testMapper;

  @Override
  //@Transactional //子线程加事务，其他线程不回滚
  @TestAnnotation
  public int insertOne(Student student) throws Exception {
    //return -1;
    if(student.getName().equals("ljtest2")){
      throw new Exception("lijian2异常");
    }
    return testMapper.insert(student);
  }
}
