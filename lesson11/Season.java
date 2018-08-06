package com.company.lesson11;

public enum Season {
    WINTER(-10), SPRING(10), SUMMER(27) {
        public void getDescription() {
            System.out.println("Теплое время года");
        }
    }, AUTUMN(15);

    private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }


}
