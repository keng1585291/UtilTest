package cn.joe.test.reflect;

import java.io.Serializable;

public class Test02 extends Test01 {

  private String aaa;

  public Test02(Integer age, Integer number,String aaa) {
    super(age, number);
    this.aaa = aaa;
  }

  public Test02(){
    super();
  }

  public String getAaa() {
    return aaa;
  }

  public void setAaa(String aaa) {
    this.aaa = aaa;
  }
}
