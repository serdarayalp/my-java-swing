package de.meindomain.java.swing.container;

import java.awt.Color;
import javax.swing.*;

public class MyJDesktopPane {

    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);

        JDesktopPane deskPane = new JDesktopPane();
        deskPane.setBackground(Color.yellow);

        JInternalFrame inFrame1 = new JInternalFrame("Dokument 1", true, true, true, true);
        JInternalFrame inFrame2 = new JInternalFrame("Dokument 2");

        inFrame1.setSize(200, 200);
        inFrame2.setSize(200, 200);

        inFrame1.setLocation(0, 0);
        inFrame2.setLocation(200, 0);

        inFrame1.show();
        inFrame2.show();

        deskPane.add(inFrame1);
        deskPane.add(inFrame2);

        meinJDialog.add(deskPane);

        meinJDialog.setVisible(true);

    }
}