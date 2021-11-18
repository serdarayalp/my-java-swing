package de.meindomain.java.swing.component;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Date;

public class MyJFormattedTextField {

    public static void main(String[] args) {

        JFrame meinFrame = new JFrame("Mein JFrame");
        meinFrame.setSize(1500, 800);

        JPanel meinPanel = new JPanel();

        JLabel labelDatum = new JLabel("Datum");
        JLabel labelBetrag = new JLabel("Betrag");

        JFormattedTextField tfDatum = new JFormattedTextField(new Date());

        JFormattedTextField tfBetrag = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        tfBetrag.setValue(4.30);
        tfBetrag.setColumns(5);

        meinPanel.add(labelDatum);
        meinPanel.add(tfDatum);

        meinPanel.add(labelBetrag);
        meinPanel.add(tfBetrag);

        meinFrame.add(meinPanel);

        meinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        meinFrame.setVisible(true);
    }
}
