package com.bl.generics;

public class Generics {
    public int maxInt(Integer num1, Integer num2, Integer num3) {
        int max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int num3 = 2;
        Generics generics = new Generics(); //object for generic
        int maxNumber = generics.maxInt(num1, num2, num3);
        System.out.println("Maximum Number is " + maxNumber);
    }
}
