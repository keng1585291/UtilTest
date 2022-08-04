package cn.joe.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.junit.Test;

/**
 * ------------------------------------------------------------------------
 * <p>
 * Copyright © 2014-2018 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express permission of China Mobile
 * (SuZhou) Software Technology Co.,Ltd.
 *
 * @description: 集合类型测试工具
 * @author: lijian@cmss.chinamobile.com
 * @create: 2021/2/20 15:00
 * <p>
 * ------------------------------------------------------------------------
 **/

public class CollectionTestModelUtil {

  @Test
  public void testRemoveOverMethod() {
    List<String> a = new ArrayList<>();
    Iterator iterator = a.iterator();
    a.add("a");
    a.add("b");
    a.add("c");
    List<String> b = new ArrayList<>();
    b.add("a");
    b.add("b");
    b.add("c");

    Collections.sort(a);

    if(remove(a,b)){
      System.out.println(a);
    }
  }

  private boolean remove(List<String> a, List<String> b){
    return a.removeAll(b);
  }
  @Test
  public void testRemove(){
    List<String> strList = new ArrayList<>();
    for(int i=0; i<10;i++){
      strList.add(new String(String.valueOf(i)));
    }

    Iterator<String> taskIterator = strList.iterator();
    while(taskIterator.hasNext()){
      if(taskIterator.next().equals("2")){
        taskIterator.remove();
      }
    }
    System.out.println(strList);

    /*for(String str: strList){
      if(str.equals("2")){
        strList.remove(str);
      }
    }*/
  }

  @Test
  public void testStringAndList(){
    List<String> strs = new ArrayList<>();
    Map<String,Object> map = new TreeMap<>();
    map.put(null,"null");
    //System.out.println(map.get(null));

    strs.add("a");
    strs.add("b");
    strs.add("c");
    strs.add("d");
    for(int i=0;i<strs.size();i++){
      strs.remove(i);
      strs.clear();
    }
    System.out.println(strs);
    /*for (String str : strs){
      //strs.remove(str);
      *//*if (str == "a"){
        System.out.println(str);
      }*//*
    }*/
  }

  @Test
  public void testEmptyList(){
    /*List<String> list = new ArrayList<>(0);
    System.out.println(list.get(0));*/
    List<String> list = new ArrayList<>();
    for (String str : list){
      System.out.println(str);
    }
  }

  @Test
  public void testNullAndList(){
    List<String> list = new ArrayList<>();
    list.add(null);
    list.add(null);
    System.out.println(list.size());

    List<String>list2 = list.stream().filter(r-> r==null).collect(Collectors.toList());
    System.out.println(list2.size());
  }

  @Test
  public void testFilter(){
    List<User> userList = new ArrayList<>();
    userList.add(new User("1","李大锤","23","南京"));
    userList.add(new User("2","张无忌","18","西安"));
    userList.add(new User("3","刘德华","26","苏州"));
    userList.add(new User("4","郭靖","33","上海"));

    userList.add(new User("1","李大锤","23","南京"));    //id相同，其他数据也相同
    userList.add(new User("3","带头大哥","36","杭州"));  //id相同，其他数据不同

    System.out.println(userList);
    //根据userid去重
    /*userList = userList
        .stream()
        .collect(
            Collectors.collectingAndThen(
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User :: getUserid))),
                ArrayList::new));*/
    //userList = new ArrayList(userList.stream().collect(Collectors.toMap(u->u.getUserid(),u->u)).values());
    List<User> result = userList.stream().filter(u->u.getAge().equals("1000")).collect(Collectors.toList());
    System.out.println(result.size() + "result.get(0)");
  }

  @Test
  public void testSubList(){
    List<User> userList = new ArrayList<>();
    userList.add(new User("1","李大锤","23","南京"));
    userList.add(new User("2","张无忌","18","西安"));
    userList.add(null);

    userList.add(new User("1","李大锤","23","南京"));    //id相同，其他数据也相同
    userList.add(new User("3","带头大哥","36","杭州"));  //id相同，其他数据不同

    List<User> userList1 = new ArrayList(userList);

    //打印空集合，不会抛异常
    List<User> userList2= userList1.subList(userList1.size(),userList.size());
    System.out.println(userList2);

    //集合中对象引用地址相同
    userList1.get(1).setAge("10");
    System.out.println(userList.get(1).getAge());

    //只修改本集合
    userList1.remove(0);
    System.out.println(userList);

    List<User> userList3 = new ArrayList<>(userList.subList(0,3));
    userList3.removeIf(Objects::isNull);
    System.out.println(userList3);

  }

  @Test
  public void testMap(){
    Map<String,String> strMap = new HashMap<>();
    strMap.put("test","test");
    String test = strMap.get("test");
    strMap.put("test","new test");
    System.out.println(test);

  }


}

class User {
  private String userid;
  private String username;
  private String age;
  private String address;

  public User(String userid, String username, String age, String address) {
    super();
    this.userid = userid;
    this.username = username;
    this.age = age;
    this.address = address;
  }

  public String getUserid() {
    return userid;
  }
  public void setUserid(String userid) {
    this.userid = userid;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  @Override
  public String toString() {
    return "User [userid=" + userid + ", username=" + username + ", age=" + age + ", address=" + address + "]";
  }
}
