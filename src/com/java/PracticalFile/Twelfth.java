package com.java.PracticalFile;

interface printer{
    void print();
}

class Interface implements printer{
    public void print() {
        System.out.println("Interface!");
    }
}

public class Twelfth {
    public static void main(String[] args) {
        Interface face = new Interface();
        face.print();
    }
}
