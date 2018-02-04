package com.company;

public class IfElseIf1 {
    public static void main(String[] args) {
        int w;
        w = Integer.parseInt(args[0]);
        if ( w == 1){
            System.out.println("Monday");
        }else if (w == 2){
            System.out.println("Tuesday");
        }else if (w == 3){
            System.out.println("Wednesday");
        }else if (w == 4){
            System.out.println("Thursday");
        }else if (w == 5){
            System.out.println("Friday");
        }else if (w == 6 | w == 7){
            System.out.println("It's Weekend!!");
        }
    }
}
