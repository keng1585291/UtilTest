package cn.joe.test.optional;

import java.util.Objects;
import java.util.Optional;
import org.junit.Test;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/4/7 10:47
 * <p>
 * ------------------------------------------------------------------------
 **/

public class TestModelOptional {
  @Test
  public void testOptional(){
    Integer a = 0;
    System.out.println(Optional.ofNullable(a).orElse(0));
  }
}
