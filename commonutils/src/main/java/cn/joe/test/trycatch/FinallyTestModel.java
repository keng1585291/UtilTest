package cn.joe.test.trycatch;

import org.junit.Test;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 测试finally
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/3/2 14:32
 * <p>
 * ------------------------------------------------------------------------
 **/

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
