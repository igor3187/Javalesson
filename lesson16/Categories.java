package com.company.lesson16;


import java.util.Set;

public class Categories {

    private String name;
    private Set<Supplies> set;

    public Categories(String name, Set<Supplies> set) {
        this.name = name;
        this.set = set;
    }
}
