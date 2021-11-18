package de.meindomain.java.swing.component;

import javax.swing.*;

public class MyJList {
    public static void main(String[] args) {

        JFrame meinFrame = new JFrame("Mein JFrame");
        meinFrame.setSize(1500, 800);

        JPanel panel = new JPanel();

        JLabel frage = new JLabel("Für welche Themen interessierst du dich?");
        panel.add(frage);

        String interessen[] = {
                "Politik",
                "Autos",
                "Mode",
                "Film- und Fernsehen",
                "Computer",
                "Tiere",
                "Sport"
        };

        JList themenAuswahl = new JList(interessen);

        panel.add(themenAuswahl);

        meinFrame.add(panel);

        meinFrame.setVisible(true);

    }
}
