package cn.joe.test.reflect;

import java.io.Serializable;

public abstract class Test01 {

  private Integer age;
  private Integer number;

  public  Test01(){}

  public Test01(Integer age, Integer number) {
    this.age = age;
    this.number = number;
  }

  public <T> String getName(T test) {
    return test.toString();
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }
}
