package tests;

import javax.swing.*;
import java.awt.*;

public class TestTimer {
    public static void main(String[] args) {
        System.out.println("HEJ!");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(new Color(77, 187, 122));
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
