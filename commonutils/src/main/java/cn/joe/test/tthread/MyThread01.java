package cn.joe.test.tthread;

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
