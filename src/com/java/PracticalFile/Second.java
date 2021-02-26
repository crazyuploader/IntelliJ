package com.java.PracticalFile;

class DemoClass {
    DemoClass() {
        System.out.println("Default constructor of class \"DemoClass\"");
    }

    DemoClass(int x, int y) {
        int sum = x + y;
        System.out.println("Parametrised Constructor of class \"DemoClass\", Sum is = " + sum);
    }
}

public class Second {
    public static void main(String[] args) {
        DemoClass obj1 = new DemoClass();
        DemoClass obj2 = new DemoClass(1, 4);
    }
}
