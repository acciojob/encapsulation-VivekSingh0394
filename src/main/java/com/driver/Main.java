package com.driver;

public class Main {
    public static void main(String args[]) {
        RWOnly obj = new RWOnly();
      /*
       comments --  java: name has private access in com.driver.RWOnly
        obj.name = "Vivek";
        System.out.println(obj.name);
     */
         obj.setName("vivek");
          obj.getName();
    }
}