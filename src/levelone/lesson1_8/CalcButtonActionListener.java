package levelone.lesson1_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private final JTextField textField;

    public CalcButtonActionListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textValue = textField.getText();
        String[] plus = textValue.split("\\+");
        String[] difference = textValue.split("\\-");
        String[] multiply = textValue.split("\\*");
        String[] division = textValue.split("\\/");
        String[] root = textValue.split("\\√");
        if (plus.length >= 2) {
            int sum = 0;
            for (String s : plus) {
                sum += Integer.parseInt(s);
            }
            textField.setText(String.valueOf(sum));
        } else if (multiply.length >= 2) {
            int multiplyResult = 1;
            for (int i = 0; i < multiply.length; i++) {
                multiplyResult *= Integer.parseInt(multiply[i]);
            }
            textField.setText(String.valueOf(multiplyResult));
        } else if (difference.length >= 2) {
            int diffResult = Integer.parseInt(difference[0]);
            for (int i = 1; i < difference.length; i++) {
                diffResult -= Integer.parseInt(difference[i]);
            }
            textField.setText(String.valueOf(diffResult));
        } else if (division.length >= 2) {
            float divResult = Float.parseFloat(division[0]);
            for (int i = 1; i < division.length; i++) {
                divResult /= Float.parseFloat(division[i]);
            }
            textField.setText(String.valueOf(divResult));

        } else if (root.length >= 2) {
            double rootResult = Math.sqrt(Double.parseDouble(root[0]));
            textField.setText(String.valueOf(rootResult));

        }
    }
}
