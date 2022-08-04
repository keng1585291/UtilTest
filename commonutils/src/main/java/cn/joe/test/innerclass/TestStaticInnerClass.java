package cn.joe.test.innerclass;

public class TestStaticInnerClass {
  String name;

  public TestStaticInnerClass(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static StaticInnerClass getInnerClass(){
    return new TestStaticInnerClass.StaticInnerClass();
  }

  public static class StaticInnerClass{
    String name;
    StaticInnerClass(){}

    public StaticInnerClass name(String name){
      this.name = name;
      return this;
    }

    public TestStaticInnerClass test(){
      return new TestStaticInnerClass(this.name);
    }
  }

  public static void main(String[] args) {
    TestStaticInnerClass testStaticInnerClass = TestStaticInnerClass
        .getInnerClass().name("test").test();
    System.out.println(testStaticInnerClass.getName());
  }

}
