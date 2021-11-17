package de.meindomain.java.swing.component;

import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;

public class MyJButton {

    public static void main(String[] args) {

        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("Mein JFrame");
        meinJFrame.setSize(1500, 800);

        JPanel panel = new JPanel();

        panel.add(new JButton("Mein Button", MetalIconFactory.getFileChooserHomeFolderIcon()));

        meinJFrame.add(panel);

        meinJFrame.setVisible(true);
    }
}