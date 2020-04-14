package com.example;

import javax.swing.*;

public class Array {
    public static void main(String[] args) {
        System.out.println("///Array Program///\n");

        int number;
        int i;
        String input;

        input = JOptionPane.showInputDialog("Enter Number of elements -");
        number = Integer.parseInt(input);

        int [] array = new int[number];

        for(i=0; i<array.length; i++)
        {
            input = JOptionPane.showInputDialog("Enter " + i + " element:");
            array[i] = Integer.parseInt(input);
        }

        int highest = array[0];
        int lowest = array[0];

        System.out.println("Entered Array: " + java.util.Arrays.toString(array));

        /*System.out.println("Entered Array:\n");
        for (int value : array)
        {
            System.out.println(value);
        }
        */
        for (i=1; i<array.length; i++)
        {
            if (highest < array[i])
            {
                highest = array[i];
            }
        }

        System.out.println("");

        for (i=1; i<array.length; i++)
        {
            if (lowest > array[i])
            {
                lowest = array[i];
            }
        }

        System.out.println("Highest element is = " + highest);
        System.out.println("Lowest element is = " + lowest);
        System.exit(0);
    }
}
