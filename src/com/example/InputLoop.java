package com.example;

import javax.swing.*;

public class InputLoop {
    public static void main(String[] args) {
        System.out.println("///Program for loops///");

        int number;
        String input;
        boolean notInRange = false;

        do {
            input = JOptionPane.showInputDialog("Enter a number in range 0 and 100");
            number = Integer.parseInt(input);

            if (number < 0 || number > 100)
            {
                JOptionPane.showMessageDialog(null,
                        "Entered number isn't in range, please try again!");
                notInRange = true;
            }
            else
            {
                System.out.println("Entered Number is = " + number);
                notInRange = false;
            }
        } while (notInRange);
        System.exit(0);
    }
}
