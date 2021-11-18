package de.meindomain.java.swing.component;

import javax.swing.*;
import java.awt.*;

public class MyJPasswordField {
    public static void main(String[] args) {

        JFrame meinFrame = new JFrame("Mein JFrame");
        meinFrame.setSize(1500, 800);

        JPanel meinPanel = new JPanel();
        JLabel passwortLabel = new JLabel("Passwort");

        JPasswordField passwordField = new JPasswordField("Das ist ein Test...");

        passwordField.setForeground(Color.BLUE);
        passwordField.setBackground(Color.YELLOW);
        passwordField.setPreferredSize(new Dimension(400, 25));

        meinPanel.add(passwortLabel);
        meinPanel.add(passwordField);

        meinFrame.add(meinPanel);

        meinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        meinFrame.setVisible(true);
    }
}
