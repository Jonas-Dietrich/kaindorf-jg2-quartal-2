package gui;

import javax.swing.*;

public class MinMaxGUI {
    private JButton btCalculate;
    private JTextPane taNumbers;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btBiggestValue;
    private JButton btSmallestValue;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MinMaxGUI");
        frame.setContentPane(new MinMaxGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
