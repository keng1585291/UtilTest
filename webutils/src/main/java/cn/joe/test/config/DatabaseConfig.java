package cn.joe.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:configs/application.properties")
public class DatabaseConfig {
  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource(){
    DruidDataSource dataSource = new DruidDataSource() ;
    return dataSource;
  }
}
