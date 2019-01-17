package com.company.lesson10.ClothingStore;

public enum Size {
    XXS(32){
        @Override
        String getDescription() {
            return "детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    String getDescription(){
        return "взрослый размер";
    }
}
