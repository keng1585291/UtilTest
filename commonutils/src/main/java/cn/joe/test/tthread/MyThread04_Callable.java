package cn.joe.test.tthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyThread04_Callable implements Callable {

  @Override
  public String call() throws Exception {
    return test();
  }

  private String test(){
    return "aaa";
  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    MyThread04_Callable mythread = new MyThread04_Callable();
    FutureTask<String> callback = new FutureTask(mythread);
    Thread thread = new Thread(callback);
    thread.start();
    String result = callback.get();

    System.out.println(result);
  }
}
