package cn.joe.test.annotations;

import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

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
