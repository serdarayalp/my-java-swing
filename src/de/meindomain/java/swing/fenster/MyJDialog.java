package de.meindomain.java.swing.fenster;

import javax.swing.*;

public class MyJDialog {
    public static void main(String[] args) {
        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);
        meinJDialog.setModal(true);

        meinJDialog.add(new JLabel("Mein JLabel"));

        meinJDialog.setVisible(true);
    }
}
