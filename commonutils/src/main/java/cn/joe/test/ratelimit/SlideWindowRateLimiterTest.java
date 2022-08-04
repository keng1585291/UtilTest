package cn.joe.test.ratelimit;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 滑动窗口限流
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/2/23 19:49
 * <p>
 * ------------------------------------------------------------------------
 **/

public class SlideWindowRateLimiterTest {

  private  String  test1= new String();

  private static SlideWindowRateLimiterTest test0 = new SlideWindowRateLimiterTest();

  {
    System.out.println("A");
  }

  static {
    System.out.println("B");
  }



  public static void main(String[] args) {
    SlideWindowRateLimiterTest test2= new SlideWindowRateLimiterTest();
  }

  /*public static void main(String[] args) {
    StringBuffer a = new StringBuffer("A");
    StringBuffer b = new StringBuffer("B");
    operate(a,b);
    System.out.println(a+"."+b);

  }

  private static void operate(StringBuffer x, StringBuffer y){
    x.append(y);
    y=x;
  }*/
}
