package cn.joe.test.dao;

import cn.joe.test.model.Student;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

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
 * @create: 2021/2/20 16:19
 * <p>
 * ------------------------------------------------------------------------
 **/
@Mapper
public interface TestMapper {

  /**
   * 获取全量id
   */
  List<String> getAll();

  Student getOneStudent(Integer id);

  int insert(Student student);
}
