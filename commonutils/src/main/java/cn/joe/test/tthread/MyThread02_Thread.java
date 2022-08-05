package cn.joe.test.tthread;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright  2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 线程测试
 * @author: lijian@cmss.chinamobile.com
 * @create: 2022/8/3 17:51
 * <p>
 * ------------------------------------------------------------------------
 **/

public class MyThread02_Thread extends Thread {
  /*@Override
  public void run(){
    test();
  }*/

  private void test(){
    System.out.println("testAAA");
  }

  public static void main(String[] args) {
    Thread testThread = new MyThread02_Thread();
    testThread.start();
  }
}
