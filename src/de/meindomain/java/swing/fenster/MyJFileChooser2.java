package de.meindomain.java.swing.fenster;

import javax.swing.*;

public class MyJFileChooser2 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();

        JFrame meinJFrame = new JFrame("Dateiauswahl");
        meinJFrame.setSize(450, 300);

        // chooser.setDialogType(JFileChooser.SAVE_DIALOG);

        meinJFrame.add(chooser);
        meinJFrame.setVisible(true);
    }
}
