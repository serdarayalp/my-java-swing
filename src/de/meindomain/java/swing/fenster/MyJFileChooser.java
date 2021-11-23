package de.meindomain.java.swing.fenster;

import javax.swing.*;

public class MyJFileChooser {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();

        // chooser.showOpenDialog(null);
        // chooser.showSaveDialog(null);
        // chooser.showDialog(null, "Meine Aktion");

        int rueckgabeWert = chooser.showOpenDialog(null);

        // wurde auf Öffnen geklickt?
        if (rueckgabeWert == JFileChooser.APPROVE_OPTION) {
            System.out.println("Die zu öffnende Datei ist: " + chooser.getSelectedFile().getName());
        }
    }
}
