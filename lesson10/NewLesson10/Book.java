package com.company.lesson10.NewLesson10;

import java.util.Objects;

public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Print book " + getName());
    }

    public static void printBook(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println(((Book) printable).getName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + '}';
    }
}
