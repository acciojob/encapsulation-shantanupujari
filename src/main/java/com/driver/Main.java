package com.driver;

public class Main {
  public static void main(String []args){
      RWOnly obj = new RWOnly();
      //obj.s= 15; // s has private access in 'com.driver.RWOnly'
     // System.out.println(obj.s); // s has private access in 'com.driver.RWOnly'
      obj.setName("shantnau");
      System.out.println(obj.getName());
  }
}