package de.meindomain.java.swing.layout;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCardLayout extends JFrame implements ActionListener {

    CardLayout cardLayout;
    JButton btn1, btn2, btn3;

    public MyCardLayout() {

        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        setLayout(cardLayout);

        btn1 = new JButton("Apple");
        btn2 = new JButton("Boy");
        btn3 = new JButton("Cat");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        add(btn1);
        add(btn2);
        add(btn3);
    }

    public void actionPerformed(ActionEvent e) {
        cardLayout.next(getContentPane());
    }

    public static void main(String[] args) {
        MyCardLayout myFrame = new MyCardLayout();
        myFrame.setVisible(true);
    }
}