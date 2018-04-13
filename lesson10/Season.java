package com.company.lesson10;

public enum Season {
    WINTER(0),SPRING(15),SUMMER(27){
        public String getDescription(){
            return "Теплое время года";
        }
    },AUTUMN(14);

    private double avgTemperature;

    Season(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public String getDescription(){
        return "Холодное время гщда";
    }
}
