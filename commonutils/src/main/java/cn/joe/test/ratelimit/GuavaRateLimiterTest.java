package cn.joe.test.ratelimit;

import com.google.common.util.concurrent.RateLimiter;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: Google Guava限流工具
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/2/22 15:36
 * <p>
 * ------------------------------------------------------------------------
 **/

public class GuavaRateLimiterTest {
  //每秒产生10个令牌
  private RateLimiter rateLimiter = RateLimiter.create(10);

  public void exeBiz(){
    if(rateLimiter.tryAcquire(1)){
      System.out.println("线程" + Thread.currentThread().getName() + "：执行业务逻辑");
      while(true){}
    }
    else{
      System.out.println("线程" + Thread.currentThread().getName() + "：被限流");
    }
  }

  public static void main(String[] args) {
    GuavaRateLimiterTest limiterTest = new GuavaRateLimiterTest();
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    for(int i = 0; i < 30; i++){
      new Thread(limiterTest::exeBiz).start();
    }
  }
}
