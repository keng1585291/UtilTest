package cn.joe.test.dao;

import cn.joe.test.model.Student;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

  /**
   * 获取全量id
   */
  List<String> getAll();

  Student getOneStudent(Integer id);

  int insert(Student student);
}
