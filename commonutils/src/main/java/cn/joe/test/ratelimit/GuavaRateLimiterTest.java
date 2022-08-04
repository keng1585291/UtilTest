package cn.joe.test.ratelimit;

import com.google.common.util.concurrent.RateLimiter;


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
