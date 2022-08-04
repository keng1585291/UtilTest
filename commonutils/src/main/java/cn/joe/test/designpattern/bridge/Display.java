package cn.joe.test.designpattern.bridge;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 展示接口
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/7/18 17:40
 *
 * 将类的功能层次结构与类的实现层次结构分离解耦，实现可替换
 * <p>
 * ------------------------------------------------------------------------
 **/

public class Display {
  DisplayImpl displayImpl;

  Display(DisplayImpl displayImpl){
    this.displayImpl = displayImpl;
  }

  void open(){
    displayImpl.concreteOpen();
  }

  void print(){
    displayImpl.concretePrint();
  }

  void close(){
    displayImpl.concreteClose();
  }
}
