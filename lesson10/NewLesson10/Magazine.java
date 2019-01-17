package com.company.lesson10.NewLesson10;

import java.util.Objects;

public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
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
        System.out.println("Print magazine " + getName());
    }

    public static void printMagazine(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(((Magazine) printable).getName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(getName(), magazine.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Magazine{" + "name='" + name + '\'' + '}';
    }


}
