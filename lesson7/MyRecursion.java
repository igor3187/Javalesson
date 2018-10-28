package com.company.lesson7;

public class MyRecursion {
    public static void main(String[] args) {

        System.out.println(count(1,5));
     //   System.out.println(countMinus(1));
    }

    private static int count(int a,int b) {
        int result=0;

        for (int i = 1; i <= b; i++) {
            System.out.println(i);
        }
       /* if (a == 1) {
            return 1;
        }
        result = count(a);*/
        return result;
    }

  /*  private static int countMinus(int a) {

        int result;

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        if (a == 1) {
            return 1;
        }
        result = count(a);
        return result;
    }*/
}
