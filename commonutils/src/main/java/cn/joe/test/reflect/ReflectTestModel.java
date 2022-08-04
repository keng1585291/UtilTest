package cn.joe.test.reflect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;

public class ReflectTestModel {
  public static void main(String[] args) throws IllegalAccessException {
    Object a = new Test02(1,1,"aaaa");
    testInstanceOf(a);
    /*Class clazz = a.getClass();
    System.out.println(clazz.getName());
    Method[] methods = clazz.getMethods();
    for(Method method : methods){
      if(method.getName().equals("getName")){
        Class[] parameterTypes = method.getParameterTypes();
        for(Class cl:parameterTypes){
          System.out.println(cl.getName());
        }
      }
    }*/
  }

  private static void testInstanceOf(Object a){
    if(a instanceof Test02){
      Test02 b = (Test02) a;
      System.out.println( "a is Test02");
    }
    if(a instanceof Test01){
      System.out.println( "a is Test01");
    }
  }

  @Test
  public  void test()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    TestModel testModel1 = new TestModel(1, "1");
    TestModel testModel2 = new TestModel(2, "2");
    //Field[] fields = testModel1.getClass().getDeclaredFields();
    Method method = TestModel.class.getMethod("getAge");
    System.out.println(Double.valueOf(method.invoke(testModel1).toString()));
    System.out.println(Double.valueOf(method.invoke(testModel2).toString()));
    /*for (Field field : fields) {
      System.out.println(field.getType());
      field.setAccessible(true);
      System.out.println(field.getDouble(testModel1) > field.getDouble(testModel2));
    }*/
  }

  @Test
  public void testObjectMapper() throws JsonProcessingException {
    ObjectMapper objectMapper  = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    Test01 a = new Test02(1,1,"aaaa");
    String b = objectMapper.writeValueAsString(a);
    //Test02 c =objectMapper.readValue(b,Test02.class);
    Test01 c = objectMapper.readValue(b,Test01.class);
    String cStr = objectMapper.writeValueAsString(c);
    Test02 d = objectMapper.readValue(cStr,Test02.class);
    System.out.println(a == d);
    /*Double doubleA = new Double(0.0);
    float aaa=(float)doubleA;*/
  }

  @Test
  public void testReflect()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Test02 test01= new Test02();
    test01.setAaa("aa");
    TestModel testModel  = new TestModel(1, "a");
    Test02 test02 = new Test02();
    test02.setAaa("bbb");

    Method method = test01.getClass().getMethod("getAaa");
    System.out.println(method.invoke(test01));
    System.out.println(method.invoke(test02));
  }

  static class TestModel {
    private int age;
    private String number;

    public TestModel(Integer age, String number) {
      this.age = age;
      this.number = number;
    }

    public int getAge(){
      return this.age;
    }

    public <T> String getName(T test) {
      return test.toString();
    }
  }
}


