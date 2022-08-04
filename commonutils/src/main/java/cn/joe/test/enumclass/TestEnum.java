package cn.joe.test.enumclass;

public enum TestEnum {
  AAA("aaa"),
  BBB("bbb");

  private String descriotion;

  TestEnum(String descriotion){
    this.descriotion = descriotion;
  }

  public static void main(String[] args) {
    System.out.println(TestEnum.valueOf("AAA"));
  }
}
