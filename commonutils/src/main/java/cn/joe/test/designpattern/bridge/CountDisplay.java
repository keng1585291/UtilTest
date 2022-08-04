package cn.joe.test.designpattern.bridge;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 计数展示类
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/7/18 17:44
 * <p>
 * ------------------------------------------------------------------------
 **/

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
