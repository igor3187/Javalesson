package com.company.lesson10.NewLesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book = new Book("\"Azbuka\"");
        Printable magazine = new Magazine("\"Playboy\"");

        Printable[] printables = {book, magazine};
        for (Printable p : printables) {
            p.print();
        }
        Book.printBook(printables);
        Magazine.printMagazine(printables);
    }
}
