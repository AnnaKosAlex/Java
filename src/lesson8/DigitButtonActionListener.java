package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonActionListener implements ActionListener {
    private final JTextField inputField;

    public DigitButtonActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bin = (JButton) e.getSource();

        StringBuilder sb = new StringBuilder(inputField.getText());
        sb.append(bin.getText());

        inputField.setText(sb.toString());
    }
}
