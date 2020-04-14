package com.methods;

import javax.swing.*;

public class Average {
    public static void main(String[] args) {
        System.out.println("///Program for different methods///");

        int value1;
        int value2;
        String input;

        input = JOptionPane.showInputDialog("Enter first number");
        value1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter second number");
        value2 = Integer.parseInt(input);
        System.out.println("");
        printAverage(value1, value2);

        System.exit(0);
    }
    public static void printAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        System.out.println("Average of " + val1 + " and " + val2 + " is = " + average);
    }
}
