package com.company.lesson10;

public enum Clothes {
    XXS(32) {
        String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    String getDescription() {

        return "Взрослый размер";
    }

    private int euroSize;

    Clothes(int euroSize) {
        this.euroSize = euroSize;
    }
}

