package cn.joe.test.tthread;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright  2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 通过Runnable实现线程
 * @author: lijian@cmss.chinamobile.com
 * @create: 2022/8/3 18:00
 * <p>
 * ------------------------------------------------------------------------
 **/

public class MyThread03_Runnable implements Runnable{

  @Override
  public void run() {
    test();
  }

  private void test(){
    System.out.println("aaa");
    System.out.println("bbb");
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new MyThread03_Runnable());
    thread.start();
  }
}
