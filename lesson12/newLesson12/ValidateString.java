package com.company.lesson12.newLesson12;

public class ValidateString {

    public static void main(String[] args) {
       getValidateString("I like Java !!!");
    }

  public static void getValidateString(String str){
      System.out.println(str.startsWith( "I like"));
      System.out.println(str.endsWith( "!!!"));
      System.out.println(str.charAt(str.length()-1));
      System.out.println(str.indexOf("Java"));
      System.out.println(str.replace("a", "o"));
      System.out.println(str.toLowerCase());
      System.out.println(str.toUpperCase());
      System.out.println(str.substring(7));
    }
}
