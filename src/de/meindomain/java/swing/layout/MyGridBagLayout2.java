package de.meindomain.java.swing.layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;


public class MyGridBagLayout2 extends JFrame {

    public MyGridBagLayout2() {

        super("Mein GridBagLayout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        GridBagLayout gridBagLayout = new GridBagLayout();

        setLayout(gridBagLayout);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);

        JLabel label = new JLabel("Autobörse: Kfz-Verkauf");

        gridBagLayout.setConstraints(label, gridBagConstraints);
        add(label);


        gridBagConstraints.gridwidth = 1;

        label = new JLabel("Fahrzeugtyp:");
        gridBagLayout.setConstraints(label, gridBagConstraints);
        add(label);

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 3;

        String[] types = {
                "Sportwagen",
                "Limosine",
                "Coupe",
                "Transporter",
                "Bus",
                "Lkw",
                "Motorrad"};

        JComboBox jComboBox = new JComboBox(types);
        gridBagLayout.setConstraints(jComboBox, gridBagConstraints);
        add(jComboBox);


        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 1;

        label = new JLabel("Beschreibung:");
        gridBagLayout.setConstraints(label, gridBagConstraints);
        add(label);

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10;
        gridBagConstraints.weighty = 10;

        JTextArea textBeschreibung = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textBeschreibung);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        gridBagLayout.setConstraints(scrollPane, gridBagConstraints);
        add(scrollPane);

        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;

        label = new JLabel("Preis:");
        gridBagLayout.setConstraints(label, gridBagConstraints);
        add(label);

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 3;

        JTextField textPreis = new JTextField();
        gridBagLayout.setConstraints(textPreis, gridBagConstraints);
        add(textPreis);

        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;

        JButton btnSend = new JButton("Senden");
        gridBagLayout.setConstraints(btnSend, gridBagConstraints);
        add(btnSend);

        JButton btnCancel = new JButton("Abbrechen");
        gridBagLayout.setConstraints(btnCancel, gridBagConstraints);
        add(btnCancel);

        setSize(600, 400);
        setLocation(300, 300);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridBagLayout2();
    }
}

