package com.example;

import javax.swing.*;

public class InputDetails {
    public static void main(String[] args) {
        System.out.println("///User Details///");

        String firstName;
        String lastName;
        long phoneNumber;
        int age;
        String address;
        String input;

        firstName = JOptionPane.showInputDialog("Enter your first Name");
        lastName = JOptionPane.showInputDialog("Enter your last Name");
        input = JOptionPane.showInputDialog("Enter your phone number");
        phoneNumber = Long.parseLong(input);
        input = JOptionPane.showInputDialog("Enter your age");
        age = Integer.parseInt(input);
        address = JOptionPane.showInputDialog("Enter your address");

        System.out.println("\nEntered Details are: \n");
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        System.exit(0);
    }
}
