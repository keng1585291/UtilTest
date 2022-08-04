package cn.joe.test.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/4/15 15:09
 * <p>
 * ------------------------------------------------------------------------
 **/

public class TestBasic {
  private Integer  a =1;
  @Test
  public void test1(){
    //testParticalAndAll();
    /*int b = ++a;
    System.out.println(b);
    System.out.println(null +"-"+b);*/

    StringBuffer sb = new StringBuffer("aaa\n");
    System.out.println(sb.length());
    System.out.println(sb.lastIndexOf("\n"));
    sb.replace(sb.lastIndexOf("\n"), sb.lastIndexOf("\n")+1, "");
    System.out.println(sb.toString());

    StringBuffer sb1 = new StringBuffer("aavvv");
    sb1.replace(sb1.lastIndexOf("v"), sb1.lastIndexOf("v")+1, "b");
    System.out.println(sb1.toString());
  }

  @Test
  public void test2(){
    testParticalAndAll2();
    System.out.println(a);
  }
  public void testParticalAndAll(){
    a= a + 1;
  }
  public void testParticalAndAll2(){
    a= a + 2;
  }

  @Test
  public void testBoolean(){
    boolean a = false;
    if(true == a){
      System.out.println(a);
    }
    //空指针异常
    System.out.println(a==true?true:false);
    if(a){
      System.out.println("true");
    }else{
      System.out.println(a);
      //null
    }


    Integer b = null;
    Integer c = null;
    System.out.println(b + c );

  }

  @Test
  public void test(){
    String a = "testStr";
  /*  String b = "testStr";
    String c = new String("testStr");
    System.out.println( a == b );
    System.out.println( a == c);*/

    StringBuffer sbuffer = new StringBuffer("testStr");
    System.out.println(sbuffer.toString() == a);
  }

  public void  testPrimitive(Integer a){
    System.out.println(a.getClass().isPrimitive());
  }

  @Test
  public void testInteger(){
    Integer a1 = 125;
    Integer a2 = new Integer(125);
    System.out.println(a1 == a2);

  }


  @Test
  public void testLoopAndSwitch(){
    List<String> aa= new ArrayList<>();
    aa.add("a");
    aa.add("b");
    for(String str: aa){
      switch (str){
        //break for
        case "a":
          break;
        case "b":
          break;
      }
      System.out.println(str);
    }
  }

  @Test
  public void testDouble(){
    Double d1 = 100.0;
    Double d2 = 101.0;
    System.out.println(d1-d2 == 1.0);

    BigDecimal bigDecimal1 = new BigDecimal(d1);
    BigDecimal bigDecimal2 = new BigDecimal(d2);
    System.out.println(bigDecimal2.subtract(bigDecimal1).equals(new BigDecimal(1.0)));
  }

  @Test
  public void testBreakLabel(){
    here:
    for(int i=0;i<10;i++){
      if(i==2){
        System.out.println(i);
        break here;
      }
      System.out.println(i);
    }
  }

  @Test
  public void testBooleanFalse(){
    Boolean a = null;
    System.out.println(Boolean.FALSE.equals(a));
  }
}
