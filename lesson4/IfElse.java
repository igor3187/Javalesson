package com.company.lesson4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        if (r.hasNextInt()){
            int i = r.nextInt();
            checkNumber(i);
        }
    }

    private static void checkNumber(int i) {
        if (i > 0 && i < 10){
            System.out.println("Положительное число менше 10");
        }else {
            System.out.println("Положительное чисо больше или равно 10 " +
                    " или,чилсо,отрецательное");
        }
    }
}


