package de.meindomain.java.swing.container;

import java.awt.Color;
import javax.swing.*;

public class MyJToolBar {

    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);

        JToolBar toolBar = new JToolBar();
        toolBar.setSize(230, 20);

        toolBar.add(new JButton("Drehen"));
        toolBar.add(new JButton("Verkleinern"));
        toolBar.add(new JButton("Vergrößern"));

        meinJDialog.add(toolBar);

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);

        meinJDialog.add(panel);

        meinJDialog.setVisible(true);

    }
}