package com.java.PracticalFile;

class Vehicle {
    void Status() {
        System.out.println("Vehicle is stopped!");
    }
}

class Bike extends Vehicle {
    void Status() {
        System.out.println("Car is stopped!");
    }
}

public class Tenth {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.Status();
    }
}
