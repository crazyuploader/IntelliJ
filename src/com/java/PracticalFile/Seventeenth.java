package com.java.PracticalFile;

import java.applet.Applet;
import java.awt.*;

public class Seventeenth extends Applet{
    public void paint(Graphics g) {
        Font f1 = new Font("Arial", Font.BOLD, 18);
        g.setFont(f1);
        g.drawString("Hello from Applet", 30, 60);
    }
}
