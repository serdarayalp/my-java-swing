package de.meindomain.java.swing.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBoxLayout extends JFrame {

    private JPanel jPanel = new JPanel();

    private JButton[] jButtons = new JButton[9];

    public MyBoxLayout() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Hier wird festgelegt, ob es horizontal oder vertikal orientiert sein soll.
        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);

        ButtonListener buttonListener = new ButtonListener();

        for (int i = 0; i < 9; i++) {
            jButtons[i] = new JButton("Button-" + (i + 1));
            jButtons[i].addActionListener(buttonListener);
            jPanel.add(jButtons[i]);
        }

        // getContentPane().add(jPanel);
        add(jPanel);

        // bewirkt, dass die Größe dieses Fensters an die bevorzugten Größen und Layouts
        // seiner Unterkomponenten angepasst wird.
        // pack();
        setSize(1000, 500);
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
        MyBoxLayout myFrame = new MyBoxLayout();
        myFrame.setVisible(true);
    }
}
