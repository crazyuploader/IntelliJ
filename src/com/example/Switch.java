package com.example;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        System.out.println("///Switch Case Example///");

        String input;
        char choices;

        input = JOptionPane.showInputDialog("Enter a, b, c");
        choices = input.charAt(0);

        switch (choices)
        {
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null, "You entered a!");
                break;

            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null, "You entered b!");
                break;

            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null, "You entered c!");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Wrong Choice!");
        }

        System.exit(0);
    }
}
