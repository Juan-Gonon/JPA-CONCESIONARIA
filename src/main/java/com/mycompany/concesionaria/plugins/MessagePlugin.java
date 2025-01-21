package com.mycompany.concesionaria.plugins;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MessagePlugin {

    public static void showMessage(String message, String type, String title) {
        JOptionPane optionPane = new JOptionPane(message);

        if (type.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (type.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
