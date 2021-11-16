package de.meindomain.java.swing.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGridLayout extends JFrame {

    private JPanel jPanel = new JPanel();

    private JButton[] jButtons = new JButton[9];

    public MyGridLayout() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new GridLayout(3, 3));

        ButtonListener buttonListener = new ButtonListener();

        for (int i = 0; i < 9; i++) {
            jButtons[i] = new JButton("Button-" + (i + 1));
            jButtons[i].addActionListener(buttonListener);
            jPanel.add(jButtons[i]);
        }

        add(jPanel);

        pack();
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 9; i++) {
                if (e.getSource() == jButtons[i]) {
                    System.out.println("Button-" + (i + 1) + " wurde geklickt...");
                }
            }
        }
    }

    public static void main(String[] args) {
        MyGridLayout myFrame = new MyGridLayout();
        myFrame.setVisible(true);
    }
}