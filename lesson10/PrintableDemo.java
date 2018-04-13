package com.company.lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Something");
            }
        };
        printable.print();
/*
        Book book1 = new Book("Java");
        Book book2 = new Book("Php");
        Magazine magazine1 = new Magazine("F1");
        Magazine magazine2 = new Magazine("Moto GP");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
        Book.printBook(printables);
    */
    }
}