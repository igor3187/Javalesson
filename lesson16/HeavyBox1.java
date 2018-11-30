package com.company.lesson16;

public class HeavyBox1 extends Box6 implements Comparable<HeavyBox1> {
    public int weight; // вес коробки

    public HeavyBox1(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HeavyBox1(int weight) {
        this.weight = weight;
    }

    public HeavyBox1(double len, int weight) {
        super(len);
        this.weight = weight;
    }

    public HeavyBox1() {
        this.weight = -1;
    }


    @Override
    public String toString() {
        return "HeavyBox1{" + "weight=" + weight + ", width=" + width + ", height=" + height + ", depth=" + depth + "} ";
    }

    @Override
    public int compareTo(HeavyBox1 o) {
        return this.weight - o.weight;
    }

    public int getWeight() {
        return weight;
    }
}

