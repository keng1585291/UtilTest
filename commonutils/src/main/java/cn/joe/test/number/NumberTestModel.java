package cn.joe.test.number;

import org.junit.Test;

public class NumberTestModel {
  @Test
  public void testConvert(){
    Integer a = 1;
    System.out.println(Double.valueOf(a));
    /*Double b = Double.parseDouble(a.toString());
    System.out.println(b);*/
  }

  @Test
  public void testNullPointer(){
    Long a= null;
    System.out.println(0L==a);
  }

  @Test
  public void testDoubleCal(){
    Long a =101L;
    double b = a/10;
    //结果为10.0
    System.out.println(b);
  }
}

