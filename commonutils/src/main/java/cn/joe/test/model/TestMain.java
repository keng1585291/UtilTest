package cn.joe.test.model;

import cn.joe.test.reflect.Test01;
import cn.joe.test.reflect.Test02;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Test;

public class TestMain {

  public static void main(String[] args) {
    /*TestGetSet testGetSet = new TestGetSet();
    testGetSet.setA(0.0);
    testGetSet.setB(0.0);
    System.out.println(testGetSet.getC());*/


    Map<String, Test02> map = new HashMap<>(2);
    Test02 test02 = new Test02(1,1,"aa");
    map.put("aa",test02);

    for(Map.Entry entry : map.entrySet()){
      Test02 test021 = map.get(entry.getKey());
      test021.setAaa("bb");
    }
    System.out.println(map.get("aa").getAaa());
    System.out.println(test02.getAaa());

  }

  @Test
  public void testObject(){
    TestGetSet a = new TestGetSet();
    a.setA(1.2);
    TestGetSet b = a;
    b.setA(0.3);
    System.out.println(a.getA());
  }
}
