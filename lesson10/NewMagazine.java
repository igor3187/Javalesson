package com.company.lesson10;

public class NewMagazine implements NewPrintable {

    private String name;

    public NewMagazine(String name) {
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
        return "NewMagazine{" + "name='" + name + '\'' + '}';
    }

    public static void printMagazine(NewPrintable... newPrintables) {
        for (NewPrintable newPrintable : newPrintables) {
            if (newPrintable instanceof NewMagazine) {
                System.out.println(((NewMagazine) newPrintable).getName());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print Magazine: " + getName());
    }
}
