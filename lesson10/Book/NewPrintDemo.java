package com.company.lesson10.Book;

public class NewPrintDemo {
    public static void main(String[] args) {

        NewPrintable newBook = new NewBook("Adventures");
        NewPrintable newMagazine = new NewMagazine("Maxim");

        NewPrintable[] newPrintables = {newBook, newMagazine};
        for (NewPrintable newPrintable : newPrintables) {
            newPrintable.print();
        }

        NewBook.printBook(newPrintables);
        NewMagazine.printMagazine(newMagazine);
    }
}
