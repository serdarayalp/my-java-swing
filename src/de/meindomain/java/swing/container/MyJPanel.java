package de.meindomain.java.swing.container;

import javax.swing.*;
import java.awt.*;

public class MyJPanel {
    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);

        meinJDialog.add(panel);

        meinJDialog.setVisible(true);
    }
}
