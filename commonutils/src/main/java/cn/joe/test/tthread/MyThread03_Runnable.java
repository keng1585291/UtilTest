package cn.joe.test.tthread;

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
