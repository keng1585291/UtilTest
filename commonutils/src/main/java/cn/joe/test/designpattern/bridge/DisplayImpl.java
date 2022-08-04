package cn.joe.test.designpattern.bridge;

/**
 * -----------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2021 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 展示实现类
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/7/18 17:41
 * <p>
 * ------------------------------------------------------------------------
 **/

public abstract class DisplayImpl {
  abstract void concreteOpen();
  abstract void concretePrint();
  abstract void concreteClose();
}
