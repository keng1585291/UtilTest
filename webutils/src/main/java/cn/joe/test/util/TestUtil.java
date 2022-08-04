package cn.joe.test.util;

import cn.joe.test.dao.TestMapper;
import cn.joe.test.model.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
