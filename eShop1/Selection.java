package com.company.eShop1;

public enum Selection {
    CATALOGLIST("catalog list"), PRODUCTLIST("product list"), BASKET("basket"), PURCHASE("purchase");
String s;
    Selection() {
    }

    Selection(String s) {
        this.s = s;
    }
}
