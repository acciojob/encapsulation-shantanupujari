package com.driver;

public class Main {
  public static void main(String []args){
      RWOnly obj = new RWOnly();
      obj.s= 15;
      System.out.println(obj.s);
      obj.set(15);
      System.out.println(obj.get());
  }
}