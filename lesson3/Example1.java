package com.company.lesson3;

public class Example1 {
    public static void main(String[] args) {
       /* {
           int a = 10;


            {
                //int a = 12;
                System.out.println("a=" + a);
            }
        }*/
        foreach:
                     for(int j = 0; j < 5; j++) {
                            for(int k = 0; k < 3; k++) {
                                   System.out.print(" " + j);
                                   if(j == 3 && k == 1) break foreach;
                                 if(j == 0 || j == 2) break;
                              }
                       }
             }


    void sm(int c) {
        System.out.println(c);
    }
}

