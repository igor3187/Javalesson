package com.company.lesson7.secondLesson7;

public class Book1 {

    private String author, bookName;

    public Book1(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book1{" + "author='" + author + '\'' + ", bookName='" + bookName + '\'' + '}';
    }
}
