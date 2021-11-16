package de.meindomain.java.swing.layout;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame {

    private final JPanel jPanel = new JPanel();

    private final JButton jButton1 = new JButton("Button-1");
    private final JButton jButton2 = new JButton("Button-2");
    private final JButton jButton3 = new JButton("Button-3");
    private final JButton jButton4 = new JButton("Button-4");
    private final JButton jButton5 = new JButton("Button-5");

    public MyBorderLayout() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new BorderLayout());

        jPanel.add(jButton1, BorderLayout.PAGE_START);
        jPanel.add(jButton2, BorderLayout.PAGE_END);
        jPanel.add(jButton3, BorderLayout.LINE_START);
        jPanel.add(jButton4, BorderLayout.CENTER);
        jPanel.add(jButton5, BorderLayout.LINE_END);

        // leichter zu merken sind die alten Konstanten, die immer noch benutzt werden können...
        /*
        jPanel1.add(jButton1, BorderLayout.NORTH);
        jPanel1.add(jButton2, BorderLayout.SOUTH);
        jPanel1.add(jButton3, BorderLayout.WEST);
        jPanel1.add(jButton4, BorderLayout.CENTER);
        jPanel1.add(jButton5, BorderLayout.EAST);
         */

        add(jPanel);

        pack();

    }

    public static void main(String[] args) {
        MyBorderLayout myFrame = new MyBorderLayout();
        myFrame.setVisible(true);
    }

}