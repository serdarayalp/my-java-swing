package de.meindomain.java.swing.container;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MyJTabbedPane {

    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);

        JPanel panelRot = new JPanel();
        JPanel panelBlue = new JPanel();
        JPanel panelGreen = new JPanel();
        JPanel panelYellow = new JPanel();
        JPanel panelPink = new JPanel();
        JPanel panelBlack = new JPanel();

        panelRot.setBackground(Color.RED);
        panelBlue.setBackground(Color.BLUE);
        panelGreen.setBackground(Color.GREEN);
        panelYellow.setBackground(Color.YELLOW);
        panelPink.setBackground(Color.PINK);
        panelBlack.setBackground(Color.BLACK);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

        tabbedPane.addTab("Rot", panelRot);
        tabbedPane.addTab("Blau", panelBlue);
        tabbedPane.addTab("Grün", panelGreen);
        tabbedPane.addTab("Gelb", panelYellow);
        tabbedPane.addTab("Pink", panelPink);
        tabbedPane.addTab("Schwarz", panelBlack);

        meinJDialog.add(tabbedPane);

        meinJDialog.setVisible(true);
    }
}