package com.company.lesson10.NewLesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable newspaper = () -> System.out.println("Print newspaper");

        Printable book = new Book("\"Azbuka\"");
        Printable magazine = new Magazine("\"Playboy\"");

        Printable[] printables = {book, magazine, newspaper};
        for (Printable p : printables) {
            p.print();
        }
        Book.printBook(printables);
        Magazine.printMagazine(printables);
    }
}
