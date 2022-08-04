package cn.joe.test.model;

import lombok.Data;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 父类
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/5/19 9:58
 * <p>
 * ------------------------------------------------------------------------
 **/
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
