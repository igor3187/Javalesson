package com.company.lesson10;

import java.util.Objects;

public class Book implements Printable{
    private String name;



    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printBook(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println(((Book) printable).getName());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print a book " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}