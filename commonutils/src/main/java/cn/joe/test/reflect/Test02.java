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
