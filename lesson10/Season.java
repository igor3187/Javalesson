package com.company.lesson10;

public enum Season {
    WINTER(-10), SPRING(11), SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(7);

    private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
