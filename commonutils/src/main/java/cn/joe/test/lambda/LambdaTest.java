package cn.joe.test.lambda;

import cn.joe.test.model.TestGetSet;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/3/12 14:51
 * <p>
 * ------------------------------------------------------------------------
 **/

public class LambdaTest {

  public static void main(String[] args) {
    System.out.println(((String)null).equals("null"));
    LambdaTestInterface lambdaTestInterface = (int a, int b)->a + b;
    System.out.println(lambdaTestInterface.add(1,3));
  }

  @Test
  public void testEmptyStream(){
    List<TestGetSet> list = new ArrayList<>();
    list.stream().forEach(str-> System.out.println(str.getC()));
  }
}
