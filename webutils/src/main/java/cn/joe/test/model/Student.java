package cn.joe.test.model;

import java.util.Date;
import lombok.Data;
import lombok.ToString;

//@Data
@ToString(callSuper = true)
public class Student extends TestParent{
  private Integer id;

  private String name;

  private String sex;

  private Integer no;

  private Date createTime;

  private Date updateTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = "aaa";
  }

  public Integer getNo() {
    return no;
  }

  public void setNo(Integer no) {
    this.no = no;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString(){
    return "{"+super.toString()+";\"no:"+this.getNo()+"}";
  }
}
