package com.company.lesson10;

import java.util.Objects;

public class NewGuitar implements NewInstrument {

    private int str;

    public NewGuitar(int str) {
        this.str = str;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн: " + getStr() + " в " + KEY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewGuitar)) return false;
        NewGuitar newGuitar = (NewGuitar) o;
        return getStr() == newGuitar.getStr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStr());
    }

    @Override
    public String toString() {
        return "NewGuitar{" + "str=" + str + '}';
    }
}
