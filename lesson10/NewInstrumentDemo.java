package com.company.lesson10;

public class NewInstrumentDemo {
    public static void main(String[] args) {
        NewInstrument newGuitar = new NewGuitar(6);
        NewInstrument newDrum = new NewDrum(15);
        NewInstrument newTrumpet = new NewTrumpet(10);

        NewInstrument[] instruments = {newGuitar, newDrum, newTrumpet};
        for (NewInstrument instrument : instruments) {
            instrument.play();
        }
    }
}
