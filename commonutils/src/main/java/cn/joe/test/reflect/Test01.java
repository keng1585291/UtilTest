package cn.joe.test.reflect;

import java.io.Serializable;

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
 * @create: 2021/3/26 10:54
 * <p>
 * ------------------------------------------------------------------------
 **/

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
