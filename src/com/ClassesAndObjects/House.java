package com.ClassesAndObjects;

public class House {
    private int noOfDoors;
    private int noOfWindows;
    private String typeOfRoof;
    private String typeOfWalls;

    House()
    {
        noOfDoors = 0;
        noOfWindows = 0;
        typeOfRoof = "none";
        typeOfWalls = "none";
    }

    House(int noOfDoors, int noOfWindows, String typeOfRoof, String typeOfWalls)
    {
        this.noOfDoors = noOfDoors;
        this.noOfWindows = noOfWindows;
        this.typeOfRoof = typeOfRoof;
        this.typeOfWalls = typeOfWalls;
    }

    public int getNoOfDoors()
    {
        return noOfDoors;
    }

    public int getNoOfWindows()
    {
        return noOfWindows;
    }

    public String getTypeOfRoof()
    {
        return typeOfRoof;
    }

    public String getTypeOfWalls()
    {
        return typeOfWalls;
    }

    public void setNoOfDoors(int noOfDoors)
    {
        this.noOfDoors = noOfDoors;
    }

    public void setNoOfWindows(int noOfWindows)
    {
        this.noOfWindows = noOfWindows;
    }

    public void setTypeOfRoof(String typeOfRoof)
    {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWalls(String typeOfWalls)
    {
        this.typeOfWalls = typeOfWalls;
    }

}
