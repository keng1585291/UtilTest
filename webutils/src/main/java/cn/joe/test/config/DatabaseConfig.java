package cn.joe.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 数据库配置
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/2/20 17:55
 * <p>
 * ------------------------------------------------------------------------
 **/
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
