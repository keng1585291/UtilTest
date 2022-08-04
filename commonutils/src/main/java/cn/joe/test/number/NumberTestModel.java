package cn.joe.test.number;

import javax.xml.bind.SchemaOutputResolver;
import org.junit.Test;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 基本数据类型测试
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/3/19 11:04
 * <p>
 * ------------------------------------------------------------------------
 **/

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

