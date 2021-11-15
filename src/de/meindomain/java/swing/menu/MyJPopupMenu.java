package de.meindomain.java.swing.menu;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyJPopupMenu {
    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000,500);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("Mein JMenu");

        JMenuItem item = new JMenuItem("Mein JMenuItem");
        JMenuItem item2 = new JMenuItem("Mein JMenuItem innerhalb eines JPopups");

        menu.add(item);

        JSeparator sep = new JSeparator();

        menu.add(sep);

        JCheckBoxMenuItem checkBoxItem = new JCheckBoxMenuItem("Mein JCheckBoxMenuItem");
        JCheckBoxMenuItem checkBoxItem2 = new JCheckBoxMenuItem("Mein JCheckBoxMenuItem innerhalb eines JPopups");

        menu.add(checkBoxItem);

        JRadioButtonMenuItem radioButtonItem = new JRadioButtonMenuItem("Mein JRadionButtonMenuItem", true);
        JRadioButtonMenuItem radioButtonItem2 = new JRadioButtonMenuItem("Mein JRadionButtonMenuItem innerhalb eines JPopups", true);

        menu.add(radioButtonItem);

        bar.add(menu);
        meinJDialog.setJMenuBar(bar);

        JPopupMenu pop = new JPopupMenu();

        // Wir setzen die Position unseres Kontextmenüs auf die Koordinaten X = 100 und Y =100
        pop.setLocation(100, 100);

        pop.add(item2);

        JSeparator sep2 = new JSeparator();
        pop.add(sep2);

        pop.add(checkBoxItem2);
        pop.add(radioButtonItem2);

        meinJDialog.setVisible(true);

        pop.setVisible(true);

    }
}
