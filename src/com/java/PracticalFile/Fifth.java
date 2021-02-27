package com.java.PracticalFile;

class OuterClass {
    int x = 5;
    void print() {
        System.out.println("Hello from Outer Class!");
    }
    static class InnerClass {
        int y = 10;
        void print() {
            System.out.println("Hello from Inner Class!");
        }
    }
}

public class Fifth {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        outerClass.print();
        innerClass.print();
        System.out.print("Sum = ");
        System.out.println(outerClass.x + innerClass.y);
    }
}
