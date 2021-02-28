package com.java.PracticalFile;

public class SixteenthA {
    public static void main(String[] args) {
        int number = 4;
        int result;
        try {
            result = number / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide " + number + " by zero (0)");
            System.out.println("Exception: " + e);
        }
    }
}
