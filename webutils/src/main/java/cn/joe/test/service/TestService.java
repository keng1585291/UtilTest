package cn.joe.test.service;

import cn.joe.test.model.Student;
import java.util.List;

public interface TestService {

  /**
   * 获取全量id
   */
  List<String> listAll();

  Student getOneStudent(Integer id);

  int insert(Student student) throws Exception;

  int insertOne(Student student) throws Exception;

  int batchInsert(List<Student> studentList) throws Exception;
}
