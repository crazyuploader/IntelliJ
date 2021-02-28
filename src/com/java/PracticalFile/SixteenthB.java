package com.java.PracticalFile;

class invalidAge extends Exception {
    invalidAge(String string) {
        super(string);
    }
}

public class SixteenthB {
    static void validate(int age) throws invalidAge {
        if (age < 18) {
            throw new invalidAge("Not an adult yet!");
        } else {
            System.out.println("Adult found");
        }
    }
    public static void main(String[] args) {
        try {
            validate(17);
        } catch (invalidAge e) {
            System.out.println("Exception: " + e);
        }
    }
}
