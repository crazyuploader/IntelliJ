package com.java.PracticalFile;

class Car {
    public void print() {
        String car = "Ford";
        System.out.println("I have " + car + "!");
    }
}

public class Fourth extends Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.print();
    }
}
