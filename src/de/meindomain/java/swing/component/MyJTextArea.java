package de.meindomain.java.swing.component;

import javax.swing.*;
import java.awt.*;

public class MyJTextArea {
    public static void main(String[] args) {

        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("Mein JFrame");
        meinJFrame.setSize(1500, 800);

        JPanel panel = new JPanel();

        JTextArea textArea = new JTextArea(20,100);
        textArea.setForeground(Color.BLUE);
        textArea.setBackground(Color.YELLOW);

        textArea.setText("Lorem ipsum dolor sit amet, " +
                "consetetur sadipscing elitr, sed diam nonumy " +
                "eirmod tempor invidunt ut labore et " +
                "dolore magna aliquyam erat, sed diam voluptua. " +
                "At vero eos et accusam et justo duo dolores et " +
                "ea rebum.");

        //Zeilenumbruch wird eingeschaltet
        textArea.setLineWrap(true);

        //Zeilenumbrüche erfolgen nur nach ganzen Wörtern
        textArea.setWrapStyleWord(true);

        JScrollPane scrollpane = new JScrollPane(textArea);

        panel.add(scrollpane);

        meinJFrame.add(panel);

        meinJFrame.setVisible(true);
    }
}
