package de.meindomain.java.swing.fenster;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFileFilter {
    public static void main(String[] args) {

        FileFilter fileFilter = new FileNameExtensionFilter("Bilder", "gif", "png", "jpg");

        JFileChooser chooser = new JFileChooser();

        chooser.addChoosableFileFilter(fileFilter);

        JFrame meinJFrame = new JFrame("Dateiauswahl");
        meinJFrame.setSize(450, 300);
        meinJFrame.add(chooser);

        meinJFrame.setVisible(true);
    }
}
