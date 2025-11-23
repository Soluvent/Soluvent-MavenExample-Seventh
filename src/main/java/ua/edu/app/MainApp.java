package ua.edu.app;

import javax.swing.*;
import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Демонстраційний застосунок");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JPanel panel = new JPanel(new BorderLayout());

            JLabel label = new JLabel("Вітаємо у світі Maven та Swing!", SwingConstants.CENTER);
            JButton button = new JButton("Закрити");
            button.addActionListener(e -> System.exit(0));

            panel.add(label, BorderLayout.CENTER);
            panel.add(button, BorderLayout.SOUTH);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}