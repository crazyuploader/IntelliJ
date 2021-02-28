package com.java.PracticalFile;

class Threading extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Fifteenth {
    public static void main(String[] args) {
        Threading threading = new Threading();
        threading.start();
    }
}
