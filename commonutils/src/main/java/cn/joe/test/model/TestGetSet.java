package cn.joe.test.model;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 测试get set方法
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/3/25 16:32
 * <p>
 * ------------------------------------------------------------------------
 **/

public class TestGetSet {
  private Double a ;

  private Double b;

  private Double c;

  public Double getA(){
    return this.a;
  }

  public Double getB(){
    return this.b;
  }

  public Double getC(){
    return this.c;
  }

  public void setA(Double a){
    //this.a = 0.0;
    this.a = a;
  }

  public void setB(Double b){
    this.b=0.0;
  }

  public void setC(Double c){
    this.c = this.a/this.b;
  }
}
