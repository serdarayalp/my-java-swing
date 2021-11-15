package de.meindomain.java.swing.container;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MyJScrollPane {

    public static void main(String[] args) {

        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("Mein JDialog");
        meinJDialog.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Dies ist ein viel zu langer Text für dieses " +
                "kleine Fenster, so dass man horizontal " +
                "scrollen muss, um ihn komplett zu lesen."));

        JScrollPane scrollPane = new JScrollPane(panel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        meinJDialog.add(scrollPane);

        meinJDialog.setVisible(true);
    }
}