package cn.joe.test.innerclass;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 静态内部类测试
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/7/13 0:06
 * <p>
 * ------------------------------------------------------------------------
 **/

public class TestStaticInnerClass {
  String name;

  public TestStaticInnerClass(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static StaticInnerClass getInnerClass(){
    return new TestStaticInnerClass.StaticInnerClass();
  }

  public static class StaticInnerClass{
    String name;
    StaticInnerClass(){}

    public StaticInnerClass name(String name){
      this.name = name;
      return this;
    }

    public TestStaticInnerClass test(){
      return new TestStaticInnerClass(this.name);
    }
  }

  public static void main(String[] args) {
    TestStaticInnerClass testStaticInnerClass = TestStaticInnerClass
        .getInnerClass().name("test").test();
    System.out.println(testStaticInnerClass.getName());
  }

}
