package de.meindomain.java.swing.component;

import javax.swing.*;
import java.awt.*;

public class MyJRadioButton {
    public static void main(String[] args) {
        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("Mein JFrame");
        meinJFrame.setSize(1500, 800);

        JPanel panel = new JPanel();

        JLabel frage = new JLabel("Welche Farbe hat die Banane?");
        panel.add(frage);

        JRadioButton auswahl1 = new JRadioButton("Gelb");
        JRadioButton auswahl2 = new JRadioButton("Blau");

        ButtonGroup gruppe = new ButtonGroup();

        gruppe.add(auswahl1);
        gruppe.add(auswahl2);

        panel.add(auswahl1);
        panel.add(auswahl2);

        meinJFrame.add(panel);
        meinJFrame.setVisible(true);
    }
}
