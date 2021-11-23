package de.meindomain.java.swing.fenster;

import java.io.File;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) {

        File file = new File("E:/test.txt");

        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("Datei wurde erfolgreich erstellt.");
                } else {
                    System.out.println("Datei konnte nicht erstellt werden.");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}