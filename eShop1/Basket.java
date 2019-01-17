package com.company.eShop1;

import java.util.Arrays;

public class Basket {
       private Product[] products;

    public Basket() {
    }

    public Basket(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket = (Basket) o;
        return Arrays.equals(getProducts(), basket.getProducts());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getProducts());
    }

    @Override
    public String toString() {
        return "Basket{" + "products=" + Arrays.toString(products) + '}';
    }
}