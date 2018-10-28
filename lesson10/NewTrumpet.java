package com.company.lesson10;

import java.util.Objects;

public class NewTrumpet implements NewInstrument {

    private int diameter;

    public NewTrumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба размером: " + getDiameter() + " в " + KEY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewTrumpet)) return false;
        NewTrumpet that = (NewTrumpet) o;
        return getDiameter() == that.getDiameter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiameter());
    }

    @Override
    public String toString() {
        return "NewTrumpet{" + "diameter=" + diameter + '}';
    }
}
