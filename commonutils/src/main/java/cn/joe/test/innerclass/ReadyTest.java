package cn.joe.test.innerclass;

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
 * @create: 2021/3/11 15:49
 * <p>
 * ------------------------------------------------------------------------
 **/

public class ReadyTest {
  public static void main(String[] args) {
    ClassReadyTest.getInstance();
    System.out.println(ClassReadyTest.num);
    System.out.println(ClassReadyTest.str);
  }
}

class ClassReadyTest{

  //静态属性和静态方法按照定义的顺序执行
  public static int num = 1;
  public static String str = "five";

  public static ClassReadyTest c = new ClassReadyTest();

  private ClassReadyTest() {
    System.out.println(num);
    System.out.println(str);
  }

  public static ClassReadyTest getInstance(){
    return c;
  }
}
