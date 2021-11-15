package de.meindomain.java.swing.menu;

import javax.swing.*;

public class MyJCheckBoxMenuItem {
    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("Mein JDialog");

        meinJDialog.setSize(1000, 500);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("Mein JMenu");
        JMenuItem item = new JMenuItem("Mein JMenuItem");

        menu.add(item);

        JCheckBoxMenuItem checkBoxItem = new JCheckBoxMenuItem("Mein JCheckBoxMenuItem");
        menu.add(checkBoxItem);

        bar.add(menu);

        meinJDialog.setJMenuBar(bar);

        meinJDialog.setVisible(true);
    }
}
