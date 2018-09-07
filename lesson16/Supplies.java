package com.company.lesson16;

public class Supplies {

    private String name;
    private Double prise;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Supplies(String name, double prise, int rating) {
        this.name = name;
        this.prise = prise;
        this.rating = rating;
    }
}