package cn.joe.test.tthread;

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
