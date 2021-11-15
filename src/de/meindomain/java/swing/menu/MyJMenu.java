package de.meindomain.java.swing.menu;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyJMenu {
    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");

        meinJDialog.setSize(1000, 500);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("Mein JMenu");

        bar.add(menu);

        meinJDialog.setJMenuBar(bar);

        meinJDialog.setVisible(true);
    }
}
