package ui;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends Frame {
    public MainFrame() {
        JFrame frame = new JFrame("File Chooser with Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.setSize(400, 200);

        // Создаем JFileChooser и добавляем его на панель слева
        JFileChooser fileChooser = new JFileChooser();
        frame.add(fileChooser, BorderLayout.WEST);

        // Создаем панель для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // Добавляем две кнопки на панель
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.Y_AXIS));

        // Добавляем две кнопки на панель
        JButton button11 = new JButton("Button 11");
        JButton button22 = new JButton("Button 22");
        buttonPanel2.add(button11);
        buttonPanel2.add(button22);

        // Добавляем панель с кнопками на панель справа
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(buttonPanel2, BorderLayout.EAST);

        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
