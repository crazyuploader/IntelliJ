package com.java.PracticalFile;

public class Ninth {
    public static void main(String[] args) {
        Integer i1 = 35;
        Integer i2 = 46;
        Integer i3 = Integer.valueOf("35");
        Float f1 = 3.14f;
        Float f2 = Float.valueOf("3.14f");

        // compareTo() Method for Integer objects
        System.out.println("Comparing i1 & i2: " + i1.compareTo(i2));
        System.out.println("Comparing i1 & i3: " + i1.compareTo(i3));

        // equals() Method for Integer objects
        System.out.println("Comparing i1 & i2 using equals method: " + i1.equals(i2));
        System.out.println("Comparing i1 & i3 using equals method: " + i1.equals(i3));

        // compareTo() Method for Float objects
        System.out.println("Comparing f1 & f2: " + f1.compareTo(f2));

        // addition of Float & Integer object
        float sum =  f1 + i1.floatValue();
        System.out.println("Sum of f1 & i1 = " + sum);
    }
}
