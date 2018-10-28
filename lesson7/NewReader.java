package com.company.lesson7;

public class NewReader {

    private String name, lastName, faculty;
    private int ticketNum, birthDate, phoneNum;

    public NewReader(String name, String lastName, String faculty, int ticketNum, int birthDate, int phoneNum) {
        this.name = name;
        this.lastName = lastName;
        this.faculty = faculty;
        this.ticketNum = ticketNum;
        this.birthDate = birthDate;
        this.phoneNum = phoneNum;
    }

    void takeBook(int count) {
        System.out.println(this.name + " " + this.lastName + " took " + count + " books");
    }

    void takeBook(String... arrBook) {
        System.out.println(this.name + " " + this.lastName + " took books: ");
        for (int i = 0; i < arrBook.length; i++) {
            System.out.println(arrBook[i]);
        }
    }

    void takeBook(Book... objectBook) {
        System.out.println(this.name + " " + this.lastName + " took books: ");
        for (int i = 0; i < objectBook.length; i++) {
            System.out.println(objectBook[i].getTitleOfBook() + " ");
            System.out.println(objectBook[i].getAuthor());
        }
    }

    void returnBook(int count) {
        System.out.println(this.name + " " + this.lastName + " returned" + count + " books");
    }

    void returnBook(String... arrBook) {
        System.out.println(this.name + " " + this.lastName + " returned books: ");
        for (int i = 0; i < arrBook.length; i++) {
            System.out.println(arrBook[i]);
        }
    }

    void returnBook(Book... objectBook) {
        System.out.println(this.name + " " + this.lastName + " returned books: ");
        for (int i = 0; i < objectBook.length; i++) {
            System.out.println(objectBook[i].getTitleOfBook() + " ");
            System.out.println(objectBook[i].getAuthor());
        }

    }
}
