package cn.joe.test.designpattern.bridge;

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
