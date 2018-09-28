package com.company.lesson20;

public class NewRunnable implements Runnable {
    public static void main(String[] args) {


    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }


    }
}
