package cn.joe.test.enumclass;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 测试枚举类
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/3/5 14:16
 * <p>
 * ------------------------------------------------------------------------
 **/

public enum TestEnum {
  AAA("aaa"),
  BBB("bbb");

  private String descriotion;

  TestEnum(String descriotion){
    this.descriotion = descriotion;
  }

  public static void main(String[] args) {
    System.out.println(TestEnum.valueOf("AAA"));
  }
}
