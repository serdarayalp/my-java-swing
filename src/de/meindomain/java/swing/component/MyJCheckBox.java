package de.meindomain.java.swing.component;

import javax.swing.*;
import java.awt.*;

public class MyJCheckBox {
    public static void main(String[] args) {
        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("Mein JFrame");
        meinJFrame.setSize(1500, 800);

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);

        JLabel label = new JLabel("Kaffee mit");
        panel.add(label);

        JCheckBox checkBox1 = new JCheckBox("Milch");
        checkBox1.setBackground(Color.YELLOW);

        JCheckBox checkBox2 = new JCheckBox("Zucker");
        checkBox2.setBackground(Color.YELLOW);

        panel.add(checkBox1);
        panel.add(checkBox2);

        meinJFrame.add(panel);

        meinJFrame.setVisible(true);
    }
}
