package LevelOne.lesson1_8;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    private JTextField inputArea;

    public CalculatorFrame() {
        setTitle("Calculator v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(100, 100, 300, 500);

        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);
        add(createBottomPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createTopPanel(){
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputArea = new JTextField();
        inputArea.setEnabled(false);
        top.add(inputArea, BorderLayout.CENTER);

        return top;
    }

    private JPanel createBottomPanel(){
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 4));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputArea);

        for (int i = 0; i < 10 ; i++) {
            JButton bin = new JButton(String.valueOf(i));
            bin.addActionListener(digitButtonActionListener);
            bottom.add(bin);
        }

        JButton clear = new JButton("C");
        clear.addActionListener(e -> inputArea.setText(""));
        bottom.add(clear);

        JButton calc = new JButton("=");
        calc.addActionListener(new CalcButtonActionListener(inputArea));
        bottom.add(calc);

        JButton plus = new JButton("+");
        plus.addActionListener(e -> inputArea.setText(inputArea.getText() + "+"));
        bottom.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(e -> inputArea.setText(inputArea.getText() + "-"));
        minus.addActionListener(new CalcButtonActionListener(inputArea));
        bottom.add(minus);

        JButton increase = new JButton("*");
        increase.addActionListener(e -> inputArea.setText(inputArea.getText() + "*"));
        increase.addActionListener(new CalcButtonActionListener(inputArea));
        bottom.add(increase);

        JButton division = new JButton("/");
        division.addActionListener(e -> inputArea.setText(inputArea.getText() + "/"));
        division.addActionListener(new CalcButtonActionListener(inputArea));
        bottom.add(division);

        JButton square = new JButton("√");
        square.addActionListener(e -> inputArea.setText(inputArea.getText() + "√"));
        square.addActionListener(new CalcButtonActionListener(inputArea));
        bottom.add(square);

        return bottom;
    }


    private JMenuBar createMenuBar(){

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        return menuBar;
    }
}
