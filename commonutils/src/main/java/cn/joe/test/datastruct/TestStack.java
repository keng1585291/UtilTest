package cn.joe.test.datastruct;

import java.util.Stack;
import org.junit.Test;

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
