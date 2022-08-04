package cn.joe.test.ratelimit;

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
