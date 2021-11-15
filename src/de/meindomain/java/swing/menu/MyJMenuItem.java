package de.meindomain.java.swing.menu;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyJMenuItem {
    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein Dialog");

        meinJDialog.setSize(1000, 500);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("Mein JMenu");
        JMenuItem item = new JMenuItem("Mein JMenuItem");

        menu.add(item);
        bar.add(menu);

        meinJDialog.setJMenuBar(bar);

        meinJDialog.setVisible(true);
    }
}
