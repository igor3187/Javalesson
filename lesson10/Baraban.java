package com.company.lesson10;

public class Baraban implements Instrument {
    private int rasmer;

    public Baraban(int rasmer) {
        this.rasmer = rasmer;
    }

    public int getRasmer() {
        return rasmer;
    }

    public void setRasmer(int rasmer) {
        this.rasmer = rasmer;
    }

    public void play() {
        System.out.println("Играет барабан! " + rasmer + " размер");
    }

    @Override
    public String toString() {
        return "Baraban{" +
                "rasmer=" + rasmer +
                '}';
    }

}

