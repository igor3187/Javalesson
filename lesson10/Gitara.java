package com.company.lesson10;

public class Gitara implements Instrument {
    private int struny;

    public Gitara(int struny) {
        this.struny = struny;
    }

    public int getStruny() {
        return struny;
    }

    public void setStruny(int struny) {
        this.struny = struny;
    }

    public void play() {
        System.out.println("Играет гитара! " + struny + " струн");
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "struny=" + struny +
                '}';
    }
}
