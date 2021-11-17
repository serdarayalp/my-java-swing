package de.meindomain.java.swing.component;

import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;

public class MyJLabel {

    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);

        // Wir holen uns ein Icon aus dem dem Java Look and Feel
        Icon icon = MetalIconFactory.getFileChooserHomeFolderIcon();

        JLabel label = new JLabel("Das ist ein Test...", icon, JLabel.LEFT);
        label.setVerticalAlignment(JLabel.TOP);

        // Die relative Ausrichtung des Textes zum Icon setzen wir auf "LEFT"
        label.setHorizontalTextPosition(JLabel.RIGHT);

        meinJDialog.add(label);

        meinJDialog.setVisible(true);
    }
}