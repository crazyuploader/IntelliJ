package com.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        House house = new House(); // Initializing a new object of class "House"

        System.out.println("First House");
        System.out.println("No. of Doors: " + house.getNoOfDoors());
        System.out.println("No. of Windows: " + house.getNoOfDoors());
        System.out.println("Type of Roof: " + house.getTypeOfRoof());
        System.out.println("Type of Walls: " + house.getTypeOfWalls());

        House house2 = new House(2, 4, "Plaster", "Brick");

        System.out.println("");
        System.out.println("Second House");
        System.out.println("No. of Doors: " + house2.getNoOfDoors());
        System.out.println("No. of Windows: " + house2.getNoOfWindows());
        System.out.println("Type of Roof: " + house2.getTypeOfRoof());
        System.out.println("Type of Walls: " + house2.getTypeOfWalls());
    }
}
