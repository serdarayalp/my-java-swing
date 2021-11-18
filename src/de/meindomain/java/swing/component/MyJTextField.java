package de.meindomain.java.swing.component;

import javax.swing.*;
import java.awt.*;

public class MyJTextField {
    public static void main(String[] args) {

        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("Mein JFrame");
        meinJFrame.setSize(1500, 800);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Vorname");
        panel.add(label);

        JTextField textField = new JTextField("");

        textField.setForeground(Color.BLUE);
        textField.setBackground(Color.YELLOW);
        textField.setPreferredSize(new Dimension(250,28));

        panel.add(textField);

        JButton buttonOK = new JButton("OK");
        panel.add(buttonOK);

        meinJFrame.add(panel);

        meinJFrame.setVisible(true);
    }
}
