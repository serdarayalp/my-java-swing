package de.meindomain.java.swing.layout;

import java.awt.*;
import javax.swing.*;

public class MyGridBagLayout extends JFrame {

    public static void main(String[] args) {
        MyGridBagLayout myFrame = new MyGridBagLayout();
        myFrame.setVisible(true);
    }

    public MyGridBagLayout() {

        GridBagLayout gridBagLayout = new GridBagLayout();

        GridBagConstraints constraints = new GridBagConstraints();

        setLayout(gridBagLayout);
        setTitle("Mein JFrame");

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(new Button("Button One"), constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(new Button("Button two"), constraints);

        constraints.ipady = 20;
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(new Button("Button Three"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        add(new Button("Button Four"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridwidth = 2;
        this.add(new Button("Button Five"), constraints);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pack();
    }

}