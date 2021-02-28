package com.java.PracticalFile;

class Storage {
    public Storage() {
        System.out.println("Class Storage");
    }
}

class nonVolatile extends Storage {
    public nonVolatile() {
        System.out.println("Class nonVolatile");
    }

    public void storageType() {
        System.out.println("Storage Type: Permanent");
    }
}

class hardDisk extends nonVolatile {
    private int id = 44578765;
    protected int speed = 7200;
    public hardDisk() {
        System.out.println("Class hardDisk");
    }

    public void speed() {
        System.out.println("Hard Disk Speed: " + speed + " rpm");
    }

    public void id() {
        System.out.println("Hard Disk ID: " + id);
    }
}

public class Eleventh {
    public static void main(String[] args) {
        hardDisk disk = new hardDisk();
        disk.storageType();
        disk.speed();
        disk.id();
    }
}
