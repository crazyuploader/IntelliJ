package com.example;

import javax.swing.*;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("///Sum and Average of entered numbers using Array///");

        int numbers;
        int i = 0;
        int sum = 0;
        String input;

        input = JOptionPane.showInputDialog("Enter number of elements");
        numbers = Integer.parseInt(input);

        int [] array = new int [numbers];

        while(i<array.length)
        {
            input = JOptionPane.showInputDialog("Enter " + i + " element");
            array[i] = Integer.parseInt(input);
            i++;
        }
        System.out.println();
        System.out.println("Entered Array = " + java.util.Arrays.toString(array));

        for(i=0; i<array.length; i++)
        {
            sum = sum + array[i];
        }

        System.out.println();
        System.out.println("Sum of entered Array: " + sum);
        System.out.println("Average of entered Array: " + getAverage(sum, array.length));
    }

    public static double getAverage(int grand, int elements) {
        return (double) grand / elements;
    }
}
