package com.java.PracticalFile;

interface first {
    void functionA();
}

interface second extends first {
    void functionB();
}

class Hello implements second {
    public void functionA() {
        System.out.println("Hello from Function A");
    }

    public void functionB() {
        System.out.println("Hello from Function B");
    }
}

public class Thirteenth {
    public static void main(String[] args) {
        Hello object = new Hello();
        object.functionA();
        object.functionB();
    }
}
