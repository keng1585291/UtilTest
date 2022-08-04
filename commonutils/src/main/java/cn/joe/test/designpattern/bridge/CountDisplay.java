package cn.joe.test.designpattern.bridge;

public class CountDisplay extends Display {

  CountDisplay(DisplayImpl displayImpl) {
    super(displayImpl);
  }

  void multiDisplay(int times){
    open();

    for(int i=0; i<times; i++){
      print();
    }

    close();
  }
}
