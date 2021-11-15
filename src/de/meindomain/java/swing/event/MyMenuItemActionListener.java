package de.meindomain.java.swing.event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyMenuItemActionListener extends JFrame {

    JMenuBar menuBar;

    JMenu fileMenu;

    JMenuItem openItem;
    JMenuItem closeItem;

    public MyMenuItemActionListener() {

        setTitle("Mein JFrame");
        setSize(1000, 500);

        menuBar = new JMenuBar();

        fileMenu = new JMenu("Datei");

        openItem = new JMenuItem("Öffnen");
        closeItem = new JMenuItem("Schließen");

        fileMenu.add(openItem);
        fileMenu.add(closeItem);

        menuBar.add(fileMenu);

        add(menuBar, BorderLayout.NORTH);

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(null);
            }
        });

        closeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyMenuItemActionListener myJFrame = new MyMenuItemActionListener();
        myJFrame.setVisible(true);
    }
}