package cn.joe.test.tthread;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright  2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 匿名方法生成线程
 * @author: lijian@cmss.chinamobile.com
 * @create: 2022/8/3 17:53
 * <p>
 * ------------------------------------------------------------------------
 **/

public class MyThread01 {

  public static void main(String[] args) {
    //无任何实现，单纯开线程
    Thread thread01 = new Thread();
    thread01.start();

    //匿名方法生成线程
    Thread thread02 = new Thread(() -> {
      test();
    });
    thread02.start();
  }

  private static void test(){
    System.out.println("aaa");
    System.out.println("bbb");
  }
}
