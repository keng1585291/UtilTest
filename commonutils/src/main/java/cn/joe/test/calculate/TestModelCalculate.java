package cn.joe.test.calculate;

import io.netty.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class TestModelCalculate {
  int a;
  Integer aa;
  @Test
  public void testLog(){
    List<String> a= new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    System.out.println(a.getClass());
    System.out.println(b.getClass());
    System.out.println(a.getClass()==b.getClass());
    for(Integer i : b){
      System.out.println(i);
    }
    //System.out.println(Math.log(16)/Math.log(2));
  }

  @Test
  public void test(){
    System.out.println(a+aa);
  }


}
