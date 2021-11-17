package de.meindomain.java.swing.component;

import javax.swing.*;

public class MyJComboBox {
    public static void main(String[] args) {

        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("Mein JFrame");
        meinJFrame.setSize(1500, 800);

        JPanel panel = new JPanel();

        JLabel frage = new JLabel("Aus welchem Bundesland kommst du?");
        panel.add(frage);

        String[] bundeslaender = {
                "Baden-Württemberg",
                "Bayern",
                "Berlin",
                "Brandenburg",
                "Bremen",
                "Hamburg",
                "Hessen",
                "Mecklenburg-Vorpommern",
                "Niedersachsen",
                "Nordrhein-Westfalen",
                "Rheinland-Pfalz",
                "Saarland",
                "Sachsen",
                "Sachsen-Anhalt",
                "Schleswig-Holstein",
                "Thüringen"
        };

        JComboBox bundeslaenderComboBox = new JComboBox(bundeslaender);

        panel.add(bundeslaenderComboBox);

        meinJFrame.add(panel);

        meinJFrame.setVisible(true);

    }
}
