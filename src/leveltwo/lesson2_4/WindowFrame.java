package leveltwo.lesson2_4;

import javax.swing.*;
import java.awt.*;

public class WindowFrame extends JFrame{

    private JTextArea textArea;
    private JTextField textMassage;

    public WindowFrame() {

        setTitle("ChatClient v1.0"); //название
        setBounds(300, 300, 400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new BorderLayout());

        JPanel bottomPanel = new JPanel();
        add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.setPreferredSize(new Dimension(1, 40));
        bottomPanel.setLayout(new BorderLayout());

        JButton startButton = new JButton("Send message");
        bottomPanel.add(startButton, BorderLayout.EAST);

        textArea = new JTextArea();
        JScrollPane textAreaScroll = new JScrollPane(textArea);
        centerPanel.add(textAreaScroll, BorderLayout.CENTER);
        textArea.setEditable(false);

        textMassage = new JTextField();
        bottomPanel.add(textMassage, BorderLayout.CENTER);

        startButton.addActionListener(e -> addText());

        textMassage.addActionListener(e -> addText());

        setVisible(true);
    }


    void addText() {
        textArea.append(textMassage.getText()+"\n");
        textMassage.setText("");
    }

}
