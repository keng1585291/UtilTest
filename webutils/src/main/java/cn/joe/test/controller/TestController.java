package cn.joe.test.controller;

import cn.joe.test.config.TestReadFromProperties;
import cn.joe.test.model.Student;
import cn.joe.test.service.TestService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
 * @create: 2021/2/20 16:17
 * <p>
 * ------------------------------------------------------------------------
 **/
@RestController
@RequestMapping("/v1/test")
public class TestController {
  @Autowired
  private TestReadFromProperties testReadFromProperties;
  @Autowired
  private DataSource dataSource;
  @Autowired
  private TestService testService;
  @Value("${testaaa}")
  private String testaaa;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String testInit(){
    System.out.println(testReadFromProperties.toString());
    return "Hello" + testService.listAll();
  }

  @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
  public String testInit(@PathVariable("id")Integer id){
    Student student= testService.getOneStudent(id);
    System.out.println(student.toString());
    return "Hello" + student.toString();
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public void testTransactional() throws Exception {
    Student student = new Student();
    student.setId(new Random().nextInt());
    student.setName("ljtest1");
    student.setNo(new Random().nextInt());
    student.setSex("male");
    student.setCreateTime(new Date());
    testService.insert(student);
  }

  @RequestMapping(value = "/batch", method = RequestMethod.POST)
  public void testParallelStream() throws Exception {
    List<Student> studentList = new ArrayList<>();
    for(int i=0;i<10;i++){
      Student student = new Student();
      student.setId(new Random().nextInt());
      student.setName("ljtest"+i);
      student.setNo(new Random().nextInt());
      student.setSex("male");
      student.setCreateTime(new Date());
      studentList.add(student);
    }
    testService.batchInsert(studentList);
  }

  @RequestMapping(value = "/test/auto", method = RequestMethod.GET)
  public void testAuto(){
    System.out.println(testaaa);
  }
}
