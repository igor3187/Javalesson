package com.company.lesson16;

import java.util.Comparator;

public class PriceComparator implements Comparator<Supplies> {

    @Override
    public int compare(Supplies o1, Supplies o2) {
        if (o1.getPrise() > o2.getPrise()) {
            return -1;
        } else if (o1.getPrise() < o2.getPrise()) {
            return 1;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
