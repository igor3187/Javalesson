package com.company.eShop1;

import java.util.Objects;

public class Product {
    private String name;
    private double prise;
    private int rating;

    public Product(String name, double prise, int rating) {
        this.name = name;
        this.prise = prise;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrise(), getPrise()) == 0 && getRating() == product.getRating() && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrise(), getRating());
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", prise=" + prise + ", rating=" + rating + '}';
    }
}
