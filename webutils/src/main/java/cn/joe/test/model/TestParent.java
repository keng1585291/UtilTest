package cn.joe.test.model;

import lombok.Data;

//@Data
public class TestParent {
  private Integer no;

  public Integer getNo() {
    return no;
  }

  public void setNo(Integer no) {
    this.no = no;
  }

  @Override
  public String toString(){
    return "{\"no\":"+getNo()+"}";
  }
}
