package com.java.PracticalFile;

public class Seventh {
    public static void main(String[] args) {
        String java = "This is a string ";
        String java2 = "& This is a second String";
        String java3 = "This a third String";

        System.out.println("Character at index position 0: " + java.charAt(0));
        System.out.println(java.concat(java2));
        System.out.println("'" + java3 + "' has 'Java' " + java.contains("java"));
        System.out.println("'" + java3 + "' string is empty: " + java3.isEmpty());
        System.out.println(java3.replace("S", "C"));
        System.out.println(java3.toLowerCase());
        System.out.print(java3.toUpperCase());
    }
}
