package com.xuan.string;

/**
 * String
 */
public class String1 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        System.out.println(test());

    }
    static  String test() {
       try {
           System.out.println("here is try!");
           return "here is try";
       } catch (Exception e) {
           System.out.println("here is catch!");
           return "here is catch";
       } finally {
           System.out.println("here is finally!");
           return "here is finally";
       }
    }
}
