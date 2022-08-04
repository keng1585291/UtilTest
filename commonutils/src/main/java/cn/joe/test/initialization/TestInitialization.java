package cn.joe.test.initialization;

import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 测试初始化
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/3/20 16:57
 * <p>
 * ------------------------------------------------------------------------
 **/

public class TestInitialization {

  public static void main(String[] args) {
    //System.out.println(Son.m);
    System.out.println(System.getProperty("java.class.path"));
    /**
     * D:\JDK8\jre\lib\charsets.jar;
     * D:\JDK8\jre\lib\deploy.jar;
     * D:\JDK8\jre\lib\ext\access-bridge-64.jar;
     * D:\JDK8\jre\lib\ext\cldrdata.jar;
     * D:\JDK8\jre\lib\ext\dnsns.jar;
     * D:\JDK8\jre\lib\ext\jaccess.jar;
     * D:\JDK8\jre\lib\ext\jfxrt.jar;
     * D:\JDK8\jre\lib\ext\localedata.jar;
     * D:\JDK8\jre\lib\ext\nashorn.jar;
     * D:\JDK8\jre\lib\ext\sunec.jar;
     * D:\JDK8\jre\lib\ext\sunjce_provider.jar;
     * D:\JDK8\jre\lib\ext\sunmscapi.jar;
     * D:\JDK8\jre\lib\ext\sunpkcs11.jar;
     * D:\JDK8\jre\lib\ext\zipfs.jar;
     * D:\JDK8\jre\lib\javaws.jar;
     * D:\JDK8\jre\lib\jce.jar;
     * D:\JDK8\jre\lib\jfr.jar;
     * D:\JDK8\jre\lib\jfxswt.jar;
     * D:\JDK8\jre\lib\jsse.jar;
     * D:\JDK8\jre\lib\management-agent.jar;
     * D:\JDK8\jre\lib\plugin.jar;
     * D:\JDK8\jre\lib\resources.jar;
     * D:\JDK8\jre\lib\rt.jar;
     * E:\IdeaCode\projects4utils\commonutils\target\classes;
     * D:\download\repositories\com\google\guava\guava\28.2-android\guava-28.2-android.jar;
     * D:\download\repositories\com\google\guava\failureaccess\1.0.1\failureaccess-1.0.1.jar;
     * D:\download\repositories\com\google\guava\listenablefuture\9999.0-empty-to-avoid-conflict-with-guava\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;
     * D:\download\repositories\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar;
     * D:\download\repositories\org\checkerframework\checker-compat-qual\2.5.5\checker-compat-qual-2.5.5.jar;
     * D:\download\repositories\com\google\errorprone\error_prone_annotations\2.3.4\error_prone_annotations-2.3.4.jar;
     * D:\download\repositories\com\google\j2objc\j2objc-annotations\1.3\j2objc-annotations-1.3.jar;
     * D:\download\repositories\com\github\onblog\snowjena-core\4.0.0.RELEASE\snowjena-core-4.0.0.RELEASE.jar;
     * D:\download\repositories\com\github\onblog\snowjena-common\4.0.0.RELEASE\snowjena-common-4.0.0.RELEASE.jar;
     * D:\download\repositories\com\alibaba\fastjson\1.2.73\fastjson-1.2.73.jar;
     * D:\download\repositories\com\github\onblog\snowjena-monitor\4.0.0.RELEASE\snowjena-monitor-4.0.0.RELEASE.jar;
     * D:\download\repositories\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;
     * D:\download\repositories\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;
     * D:\download\repositories\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;
     * D:\download\repositories\junit\junit\4.12\junit-4.12.jar;
     * D:\download\repositories\org\hamcrest\hamcrest-core\2.1\hamcrest-core-2.1.jar;
     * D:\download\repositories\org\hamcrest\hamcrest\2.1\hamcrest-2.1.jar;
     * D:\download\repositories\com\alibaba\cloud\spring-cloud-starter-alibaba-sentinel\2.2.1.RELEASE\spring-cloud-starter-alibaba-sentinel-2.2.1.RELEASE.jar;D:\download\repositories\com\alibaba\csp\sentinel-transport-simple-http\1.7.1\sentinel-transport-simple-http-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-transport-common\1.7.1\sentinel-transport-common-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-datasource-extension\1.7.1\sentinel-datasource-extension-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-annotation-aspectj\1.7.1\sentinel-annotation-aspectj-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-core\1.7.1\sentinel-core-1.7.1.jar;D:\download\repositories\org\aspectj\aspectjrt\1.9.5\aspectjrt-1.9.5.jar;D:\download\repositories\org\aspectj\aspectjweaver\1.9.5\aspectjweaver-1.9.5.jar;D:\download\repositories\com\alibaba\cloud\spring-cloud-circuitbreaker-sentinel\2.2.1.RELEASE\spring-cloud-circuitbreaker-sentinel-2.2.1.RELEASE.jar;D:\download\repositories\org\springframework\cloud\spring-cloud-commons\2.2.2.RELEASE\spring-cloud-commons-2.2.2.RELEASE.jar;D:\download\repositories\org\springframework\security\spring-security-crypto\5.2.2.RELEASE\spring-security-crypto-5.2.2.RELEASE.jar;D:\download\repositories\com\alibaba\csp\sentinel-reactor-adapter\1.7.1\sentinel-reactor-adapter-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-spring-webflux-adapter\1.7.1\sentinel-spring-webflux-adapter-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-spring-webmvc-adapter\1.7.1\sentinel-spring-webmvc-adapter-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-parameter-flow-control\1.7.1\sentinel-parameter-flow-control-1.7.1.jar;D:\download\repositories\com\googlecode\concurrentlinkedhashmap\concurrentlinkedhashmap-lru\1.4.2\concurrentlinkedhashmap-lru-1.4.2.jar;D:\download\repositories\com\alibaba\csp\sentinel-cluster-server-default\1.7.1\sentinel-cluster-server-default-1.7.1.jar;D:\download\repositories\com\alibaba\csp\sentinel-cluster-common-default\1.7.1\sentinel-cluster-common-default-1.7.1.jar;D:\download\repositories\io\netty\netty-handler\4.1.48.Final\netty-handler-4.1.48.Final.jar;D:\download\repositories\io\netty\netty-common\4.1.48.Final\netty-common-4.1.48.Final.jar;D:\download\repositories\io\netty\netty-resolver\4.1.48.Final\netty-resolver-4.1.48.Final.jar;D:\download\repositories\io\netty\netty-buffer\4.1.48.Final\netty-buffer-4.1.48.Final.jar;D:\download\repositories\io\netty\netty-transport\4.1.48.Final\netty-transport-4.1.48.Final.jar;D:\download\repositories\io\netty\netty-codec\4.1.48.Final\netty-codec-4.1.48.Final.jar;D:\download\repositories\com\alibaba\csp\sentinel-cluster-client-default\1.7.1\sentinel-cluster-client-default-1.7.1.jar;D:\download\repositories\com\alibaba\cloud\spring-cloud-alibaba-sentinel-datasource\2.2.1.RELEASE\spring-cloud-alibaba-sentinel-datasource-2.2.1.RELEASE.jar;D:\download\repositories\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.10.3\jackson-dataformat-xml-2.10.3.jar;D:\download\repositories\com\fasterxml\jackson\core\jackson-core\2.10.3\jackson-core-2.10.3.jar;D:\download\repositories\com\fasterxml\jackson\core\jackson-annotations\2.10.3\jackson-annotations-2.10.3.jar;D:\download\repositories\com\fasterxml\jackson\core\jackson-databind\2.10.3\jackson-databind-2.10.3.jar;D:\download\repositories\com\fasterxml\jackson\module\jackson-module-jaxb-annotations\2.10.3\jackson-module-jaxb-annotations-2.10.3.jar;D:\download\repositories\jakarta\xml\bind\jakarta.xml.bind-api\2.3.3\jakarta.xml.bind-api-2.3.3.jar;D:\download\repositories\jakarta\activation\jakarta.activation-api\1.2.2\jakarta.activation-api-1.2.2.jar;D:\download\repositories\org\codehaus\woodstox\stax2-api\4.2\stax2-api-4.2.jar;D:\download\repositories\com\fasterxml\woodstox\woodstox-core\6.1.1\woodstox-core-6.1.1.jar;
     * D:\idea\IntelliJ IDEA 2020.1\lib\idea_rt.jar;
     * C:\Users\lenovo\AppData\Local\JetBrains\IntelliJIdea2020.1\captureAgent\debugger-agent.jar
     */

    List<Field> fields = Arrays.asList(Son.class.getFields());
    System.out.println(fields);
    //无法直接获取到父类的属性
    List<Field> fieldList = Arrays.asList(Son.class.getDeclaredFields());
    System.out.println(fieldList);
    Class father = Son.class.getSuperclass();
    System.out.println(father);
    fieldList.addAll(Arrays.asList(father.getDeclaredFields()));
    System.out.println(fieldList);
  }
}

class Father{
   private String name;

   private Boolean gender;

  public Boolean getGender() {
    return gender;
  }

  public void setGender(Boolean gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  static {
     System.out.println("父类被加载");
   }

   static final int m =100;

   final static void  test(){
    System.out.println("父类test");
  }
}

class Son extends Father{
  private String name;

  private Integer age;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  static {
    System.out.println("子类被加载");
  }

  final static void  test1(){
    System.out.println("子类test");
  }

}
