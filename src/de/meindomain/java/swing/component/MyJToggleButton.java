package de.meindomain.java.swing.component;

import javax.swing.*;

public class MyJToggleButton {
    public static void main(String[] args) {
        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("Mein JFrame");
        meinJFrame.setSize(1500, 800);

        JPanel panel = new JPanel();

        JToggleButton toggleButton = new JToggleButton("Mein Button", true);

        panel.add(toggleButton);

        meinJFrame.add(panel);

        meinJFrame.setVisible(true);
    }
}
