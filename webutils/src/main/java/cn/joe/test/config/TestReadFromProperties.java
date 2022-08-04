package cn.joe.test.config;

import cn.joe.test.model.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

@Component
@ConfigurationProperties(prefix = "test")
//@PropertySource("classpath:application.yaml")
public class TestReadFromProperties {
  private String[] strings = new String[]{};

  private List<String> strs; //= new ArrayList<>();

  private List<User> users = new ArrayList<>();

  public TestReadFromProperties() {
  }

  public TestReadFromProperties(String[] strings, List<String> strs, List<User> users) {
    this.strings = strings;
    this.strs = strs;
    this.users = users;
  }

  public List<String> getStrs() {
    return strs;
  }

  public void setStrs(List<String> strs) {
    this.strs = strs;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public String[] getStrings() {
    return strings;
  }

  public void setStrings(String[] strings) {
    this.strings = strings;
  }

  @Override
  public String toString() {
    return "TestReadFromProperties{" +
        "strings=" + Arrays.toString(strings) +
        ", strs=" + strs +
        ", users=" + users +
        '}';
  }

  /*@Bean
  @ConfigurationProperties(prefix = "test")
  public TestReadFromProperties init(){
    TestReadFromProperties testReadFromProperties = new TestReadFromProperties();
    return testReadFromProperties;
  }*/

  /*  public static void main(String[] args) {
    try {
      Yaml yaml = new Yaml();
      URL url = TestReadFromProperties.class.getClassLoader().getResource("application.yaml");
      if (url != null) {
        //获取test.yaml文件中的配置数据，然后转换为obj，
        Object obj = yaml.load(new FileInputStream(url.getFile()));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        TestReadFromProperties testReadFromProperties = objectMapper.readValue(objectMapper
            .writeValueAsString(obj), TestReadFromProperties.class);
        System.out.println(testReadFromProperties);
        //也可以将值转换为Map
        Map map =(Map)yaml.load(new FileInputStream(url.getFile()));
        System.out.println(map);
        //通过map我们取值就可以了.
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }*/
}
