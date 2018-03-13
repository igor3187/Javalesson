package com.company.lesson10;

public class Truba implements Instrument {
    private int diametr;

    public Truba(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public void play() {
        System.out.println("Играет труба!");
    }

    @Override
    public String toString() {
        return "Truba{" +
                "diametr=" + diametr +
                '}';
    }
}
