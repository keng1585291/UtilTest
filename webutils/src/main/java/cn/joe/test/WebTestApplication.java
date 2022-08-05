package cn.joe.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebTestApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context =  SpringApplication.run(WebTestApplication.class , args);
    Object sqlSessionTemplate = context.getBean("sqlSessionTemplate");
  }
}
