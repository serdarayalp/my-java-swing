package de.meindomain.java.swing.fenster;

import javax.swing.*;

public class MyJFrame {
    public static void main(String[] args) {
        JFrame meinFrame = new JFrame("Mein JFrame");
        meinFrame.setSize(1500, 800);

        meinFrame.add(new JLabel("Mein JLabel"));

        meinFrame.setVisible(true);
    }
}