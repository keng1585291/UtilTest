package cn.joe.test.datastruct;

import java.util.Stack;
import org.junit.Test;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 栈
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/8/15 22:25
 * <p>
 * ------------------------------------------------------------------------
 **/

public class TestStack {
  @Test
  public void main(){
    String testStr = "let's go to school";
    test(testStr);
  }

  public void test(String str){
    char[] chars = str.toCharArray();
    Stack<Character> charStack = new Stack<>();
    for(char c:chars){
      if(c ==' '){
        while(!charStack.isEmpty()){
          System.out.print(charStack.pop());
        }
        System.out.print(c);
      }else{
        charStack.push(c);
      }
    }
    while(!charStack.isEmpty()){
      System.out.print(charStack.pop());
    }
  }
}
