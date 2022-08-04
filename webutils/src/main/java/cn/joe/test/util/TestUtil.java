package cn.joe.test.util;

import cn.joe.test.dao.TestMapper;
import cn.joe.test.model.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 工具类
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/4/1 19:42
 * <p>
 * ------------------------------------------------------------------------
 **/
@Component
public class TestUtil{
  @Autowired
  private TestMapper testMapper;

  public void insert(Student student) {
    if(student.getName().equals("ljtest2")){
      throw new RuntimeException("ljtest2 Exception");
    }
    testMapper.insert(student);
  }

  public int insert(Student student,Object object) {
    if(student.getName().equals("ljtest2")){
      throw new RuntimeException("ljtest2 Exception");
    }
    return testMapper.insert(student);
  }
}
