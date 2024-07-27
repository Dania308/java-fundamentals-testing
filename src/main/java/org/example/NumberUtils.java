package org.example;

public class NumberUtils {
    public int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Acest numar este par");
            return true;
        } else
            return false;
    }


}
