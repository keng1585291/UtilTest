package cn.joe.test.trycatch;

import org.junit.Test;

public class FinallyTestModel {

  @Test
  public void test(){
    System.out.println(getString());
    //System.out.println(testFinallyReturn());
  }

  private int testFinallyReturn(){
    int b =1;
    try{
      int a = 1/0;
      b=2;
      return b;
    }catch (Exception e){
      b=3;
      return b;
    }finally {
      b=4;
      return b;
    }
  }

  @Test
  public void execErr(){
    try{
      throw new RuntimeException();
    }catch (RuntimeException e){
      e.printStackTrace();
    }finally {
      System.out.println("执行finally");
    }
  }

  private static String getString(){
    String str = "aaa";
    try {
      throw new RuntimeException();
    }catch (Exception e){
      System.exit(0);//finally可能不执行
      System.out.println(str);
      return str;
    }finally {
      str="ccc";
      System.out.println(str);
      return str;
    }
  }
}
