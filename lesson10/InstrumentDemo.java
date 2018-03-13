package com.company.lesson10;

public class InstrumentDemo {
    public static void main(String[] args) {
        Truba truba = new Truba(3);
        Baraban baraban = new Baraban(8);
        Gitara gitara = new Gitara(6);


        Instrument[] instrument = {truba, baraban, gitara};
        for (Instrument i : instrument) {
            i.play();

        }
    }
}
