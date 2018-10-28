package com.company.lesson10;

import java.util.Objects;

public class NewDrum implements NewInstrument {

    private int size;

    public NewDrum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан диаметром: " + getSize() + " в " + KEY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewDrum)) return false;
        NewDrum drum = (NewDrum) o;
        return getSize() == drum.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize());
    }

    @Override
    public String toString() {
        return "Drum{" + "size=" + size + '}';
    }
}
