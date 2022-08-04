package cn.joe.test.service;

import cn.joe.test.model.Student;
import java.util.List;

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
 * @create: 2021/2/20 18:13
 * <p>
 * ------------------------------------------------------------------------
 **/
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
