package com.company.lesson3;

public class SystemInDemo {

    public static void main(String[] args) {
        int x;

        try {
            x = System.in.read();

            char c = (char)x;
            System.out.println("код символа: " + c + " = " + x);
        }catch (java.io.IOException e){
            System.err.println("ошибка ввода " + e);
        }
    }
}
