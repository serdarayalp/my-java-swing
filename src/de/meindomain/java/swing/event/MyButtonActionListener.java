package de.meindomain.java.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyButtonActionListener extends JFrame
        implements ActionListener {

    JButton button1, button2, button3;

    JLabel label;
    JPanel panel;

    public MyButtonActionListener() {

        setTitle("Mein JFrame");
        setSize(1000, 500);

        panel = new JPanel();
        label = new JLabel();

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        panel.add(label);

        add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            label.setText("Button 1 wurde betätigt");
        } else if (ae.getSource() == button2) {
            label.setText("Button 2 wurde betätigt");
        } else if (ae.getSource() == button3) {
            label.setText("Button 3 wurde betätigt");
        }
    }

    public static void main(String[] args) {
        MyButtonActionListener myJFrame = new MyButtonActionListener();
        myJFrame.setVisible(true);
    }
}