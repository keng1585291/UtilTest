package cn.joe.test.tthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright  2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: Callable方式创建线程
 * @author: lijian@cmss.chinamobile.com
 * @create: 2022/8/3 18:07
 * <p>
 * ------------------------------------------------------------------------
 **/

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
