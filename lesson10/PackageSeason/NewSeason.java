package com.company.lesson10.PackageSeason;

public enum NewSeason {
    WINTER(-10), SPRING(7), SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(10);

    private int averageTemp;

    NewSeason(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getInfo() {
        return this.toString() + " " + getAverageTemp();
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
