package de.meindomain.java.swing.menu;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyJSeparator {
    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("Mein JDialog");

        meinJDialog.setSize(1000, 500);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("Mein JMenu");
        JMenuItem item = new JMenuItem("Mein JMenuItem");

        menu.add(item);

        JSeparator sep1 = new JSeparator();
        menu.add(sep1);

        JCheckBoxMenuItem checkBoxItem = new JCheckBoxMenuItem("Mein JCheckBoxMenuItem");
        menu.add(checkBoxItem);

        JSeparator sep2 = new JSeparator();
        menu.add(sep2);

        JRadioButtonMenuItem radioButtonItem = new JRadioButtonMenuItem("Mein JRadionButtonMenuItem");
        menu.add(radioButtonItem);

        bar.add(menu);

        meinJDialog.setJMenuBar(bar);

        meinJDialog.setVisible(true);
    }
}
