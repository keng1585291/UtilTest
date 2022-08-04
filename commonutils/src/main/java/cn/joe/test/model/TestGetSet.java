package cn.joe.test.model;

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
