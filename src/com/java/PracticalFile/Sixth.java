package com.java.PracticalFile;

class PhoneBook {
    int number;
    String name;
    PhoneBook(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public void getDetails() {
        System.out.println(name + ", " + number);
    }
}

public class Sixth {
    public static void main(String[] args) {
        PhoneBook[] array = new PhoneBook[5];
        array[0] = new PhoneBook(123456789, "Omen");
        array[1] = new PhoneBook(234567890, "Phoenix");
        array[2] = new PhoneBook(345678912, "Cypher");
        array[3] = new PhoneBook(456789123, "Breach");
        array[4] = new PhoneBook(567891234, "Reyna");

        System.out.println("PhoneBook Details -\n");
        array[0].getDetails();
        array[1].getDetails();
        array[2].getDetails();
        array[3].getDetails();
        array[4].getDetails();
    }
}
