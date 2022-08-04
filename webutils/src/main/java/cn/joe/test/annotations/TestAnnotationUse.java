package cn.joe.test.annotations;

import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

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
 * @create: 2021/3/23 13:41
 * <p>
 * ------------------------------------------------------------------------
 **/
@Component
public class TestAnnotationUse {
  @Autowired
  private ApplicationContext applicationContext;

  @TestAnnotation
  public DataSource main() {
    DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
    System.out.println(dataSource.getClass().getSimpleName());
    return dataSource;
  }
}
