package com.company.lesson3;

public class PrimitiveDataType {

    public static void main(String[] args) {


        byte b = 12;

        short s = 129;

        int i = 444;

        long l = 3232323;

        longToInt((int) l);

        intToShort((short) i);

        shortToByte((byte) s);

        System.out.println(l);

    }

    private static int longToInt(int l) {
        return l;
    }

    private static short intToShort(short i) {
        return i;
    }

    private static void shortToByte(byte s) {
        byte b = s;
    }
}