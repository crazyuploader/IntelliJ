package com.example;

public class Array {
    public static void main(String[] args) {
        System.out.println("///Array Program///\n");

        int [] array = {5, 10, 15, 20, 25, 30};

        int highest = array[0];
        int lowest = array[0];
        int i;

        for (int value : array)
        {
            System.out.println(value);
        }

        for (i=1; i<array.length; i++)
        {
            if (highest < array[i])
            {
                highest = array[i];
            }
        }

        System.out.println("");

        for (i = 1; i<array.length; i++)
        {
            if (lowest > array[i])
            {
                lowest = array[i];
            }
        }

        System.out.println("Highest element is = " + highest);
        System.out.println("Lowest element is = " + lowest);
    }
}
