package de.meindomain.java.swing.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplication extends JFrame {

    private final JPanel jPanel = new JPanel();
    private final JPanel jPanelNavi = new JPanel();
    private final JPanel jPanelMenu = new JPanel();

    private final JButton jButton1 = new JButton("Content Button-1");
    private final JButton jButton2 = new JButton("Content Button-2");
    private final JButton jButton3 = new JButton("Content Button-3");
    private final JButton jButton4 = new JButton("Content Button-4");
    private final JButton jButton5 = new JButton("Content Button-5");

    private JButton[] jButtonsNavi = new JButton[9];
    private JButton[] jButtonsMenu = new JButton[9];

    public MyApplication() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new BorderLayout());
        jPanelNavi.setLayout(new BoxLayout(jPanelNavi, BoxLayout.Y_AXIS));
        jPanelMenu.setLayout(new FlowLayout(FlowLayout.LEFT));

        NavigationButtonListener navigationButtonListener = new NavigationButtonListener();
        ContentButtonListener contentButtonListener = new ContentButtonListener();
        MenuButtonListener menuButtonListener = new MenuButtonListener();

        for (int i = 0; i < 9; i++) {
            jButtonsNavi[i] = new JButton("Navigation Button-" + (i + 1));
            jButtonsNavi[i].addActionListener(navigationButtonListener);
            jPanelNavi.add(jButtonsNavi[i]);
        }

        for (int i = 0; i < 9; i++) {
            jButtonsMenu[i] = new JButton("Menu Button-" + (i + 1));
            jButtonsMenu[i].addActionListener(menuButtonListener);
            jPanelMenu.add(jButtonsMenu[i]);
        }

        jButton1.addActionListener(contentButtonListener);
        jButton2.addActionListener(contentButtonListener);
        jButton3.addActionListener(contentButtonListener);
        jButton4.addActionListener(contentButtonListener);
        jButton5.addActionListener(contentButtonListener);


        jPanel.add(jPanelMenu, BorderLayout.PAGE_START);

        jPanel.add(jButton2, BorderLayout.PAGE_END);

        jPanel.add(jPanelNavi, BorderLayout.LINE_START);

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

    class NavigationButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 9; i++) {
                if (e.getSource() == jButtonsNavi[i]) {
                    System.out.println("Navigation Button-" + (i + 1) + " wurde geklickt...");
                }
            }
        }
    }

    class ContentButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ein Content-Button wurde geklickt...");
        }
    }

    class MenuButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ein Menu-Button wurde geklickt...");
        }
    }

    public static void main(String[] args) {
        MyApplication myFrame = new MyApplication();
        myFrame.setVisible(true);
    }

}