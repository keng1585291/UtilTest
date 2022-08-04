package cn.joe.test.string;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import org.junit.Test;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 字符串类型测试工具
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/2/20 14:59
 * <p>
 * ------------------------------------------------------------------------
 **/

public class StringTestUtil {

  private String name;

  public void testInnerProperties(StringTestUtil util){
    System.out.println(util.name);
  }

  public static void main(String[] args) {
    String test = new String("This is a 测试");
    byte[] testbytes = test.getBytes();
    System.out.println(test.getBytes().length);//16

    String a= "aaa,";
    String aaa=a.split(",")[1];//下标越界
    System.out.println(aaa);



    StringBuffer b = new StringBuffer("aaa");
    System.out.println(a==b.toString());
    String c = new String("aaa");
    System.out.println(a==c);

    //String a = "a" + "b" + "c" + "d";
  }

  @Test
  public void testListConvert(){
    List<String> strsList = new ArrayList<>();
    strsList.add("aaa");
    strsList.add("bbb");
    strsList.add("ccc");
    strsList.add("ddd");
    String strsFromList = strsList.toString();
    System.out.println(strsFromList);
    String strsAfterReplace = strsFromList.replace("," , ",\n");
    System.out.println(strsAfterReplace);
  }

  @Test
  public void testNull(){
    //不会报错，为null
    Object  a = null;
    String b=(String)a;
    System.out.println(b);
  }

  @Test
  public void testPlus(){
    List<String> aaa= new ArrayList<>();
    aaa.add(null);
    aaa.add(null);
    System.out.println("打印"+ aaa.get(0)+"结束"+aaa.get(1));
  }


  @Test
  public void testStringJoiner(){
    String[] strs = {"a","b","c"};
    System.out.println(strs);
    List<String> strList = Lists.newArrayList(strs);
    System.out.println(strList);

    StringJoiner strJoiner = new StringJoiner(";");
    for(String str:strs){
      strJoiner.add(str);
    }
    System.out.println(strJoiner.toString());

    StringBuffer stringBuffer = new StringBuffer();
    for(int index = 0; index < strs.length-1; index++){
      stringBuffer.append(strs[index]+";");
    }
    stringBuffer.append(strs[strs.length-1]);
    System.out.println(stringBuffer.toString());

   /* StringJoiner stringJoiner = new StringJoiner(",");
    stringJoiner.add("aaaa");
    stringJoiner.add("bbbb");
    System.out.println(stringJoiner.toString());
    stringJoiner=null;*/
  }

  @Test
  public void testReplace(){
    String testStr = "testStr";
    String replacedTestStr = testStr.replace("t", "tt");
    System.out.println(testStr);
    System.out.println(replacedTestStr);
  }

  public enum TestEnum{
    TEST_ENUM;
  }
}

