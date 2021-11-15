package de.meindomain.java.swing.menu;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyJMenuBar {
    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);

        // Zur Veranschaulichung erstellen wir eine gelbe Umrandung
        Border border = new LineBorder(Color.yellow);

        JMenuBar bar = new JMenuBar();

        // Wir setzen die erstellte Umrandung für unsere Menüleiste
        bar.setBorder(border);

        meinJDialog.setJMenuBar(bar);

        meinJDialog.setVisible(true);
    }
}
