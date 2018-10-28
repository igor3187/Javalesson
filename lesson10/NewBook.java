package com.company.lesson10;

public class NewBook implements NewPrintable {

    private String name;

    public NewBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewBook{" + "name='" + name + '\'' + '}';
    }

    public static void printBook(NewPrintable[] newPrintables) {
        for (NewPrintable newPrintable : newPrintables) {
            if (newPrintable instanceof NewBook) {
                System.out.println(((NewBook) newPrintable).getName());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print Book: " + getName());
    }
}
