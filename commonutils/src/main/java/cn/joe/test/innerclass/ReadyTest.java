package cn.joe.test.innerclass;

public class ReadyTest {
  public static void main(String[] args) {
    ClassReadyTest.getInstance();
    System.out.println(ClassReadyTest.num);
    System.out.println(ClassReadyTest.str);
  }
}

class ClassReadyTest{

  //静态属性和静态方法按照定义的顺序执行
  public static int num = 1;
  public static String str = "five";

  public static ClassReadyTest c = new ClassReadyTest();

  private ClassReadyTest() {
    System.out.println(num);
    System.out.println(str);
  }

  public static ClassReadyTest getInstance(){
    return c;
  }
}
