package com.company.lesson14;

import com.company.lesson10.Printable;

public class PrintLocalDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Anonymous class");
            }
        };
        printable.print();
    }
}
