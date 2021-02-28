package com.java.PracticalFile;

import java.util.Vector;

public class Eighth {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(4);
        vector.add("Reyna");
        vector.add("Omen");
        vector.add("Jett");
        vector.add("Cypher");
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Elements: " + vector);
        vector.remove(2);
        System.out.println("After removing element at index position 2: " + vector);
        System.out.println("Index of 'Reyna' is = " + vector.indexOf("Reyna"));
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
    }
}
