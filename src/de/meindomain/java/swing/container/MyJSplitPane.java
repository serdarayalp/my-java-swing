package de.meindomain.java.swing.container;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MyJSplitPane {

    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(1000, 500);

        JPanel panelRot = new JPanel();
        JPanel panelGelb = new JPanel();

        panelRot.setBackground(Color.red);
        panelGelb.setBackground(Color.yellow);

        JLabel labelRot = new JLabel("ROT");
        JLabel labelGelb = new JLabel("GELB");

        panelRot.add(labelRot);
        panelGelb.add(labelGelb);

        JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        splitpane.setLeftComponent(panelRot);
        splitpane.setRightComponent(panelGelb);

        meinJDialog.add(splitpane);

        meinJDialog.setVisible(true);
    }
}