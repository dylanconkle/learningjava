package com.dylanconkle;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
	    int myMinValue=-2_147_483_648;
        int myMaxValue=2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("My Total = " + myTotal);

        //byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewbyteValue = (byte) (myMinByteValue/2);
        System.out.println("My Total = " + myNewbyteValue);

        //short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        //long has a width of 64
        long myLongMinValue = -9223372036854775808L;
        long myLongMaxValue = 9223372036854775807L;
    }
}
