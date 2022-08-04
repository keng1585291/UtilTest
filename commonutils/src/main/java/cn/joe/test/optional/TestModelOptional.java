package cn.joe.test.optional;

import java.util.Objects;
import java.util.Optional;
import org.junit.Test;

public class TestModelOptional {
  @Test
  public void testOptional(){
    Integer a = 0;
    System.out.println(Optional.ofNullable(a).orElse(0));
  }
}
