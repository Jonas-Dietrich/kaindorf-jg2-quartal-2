package gui;

import bl.MinMaxBL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinMaxGUI {
    private JButton btCalculate;
    private JTextPane taNumbers;
    private JTextField tfGreatest;
    private JTextField tfSmallest;
    private JPanel mainPanel;
    private JLabel lbGreatestValue;
    private JLabel lbSmallestValue;

    public MinMaxGUI() {
        btCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onBerechne();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MinMaxGUI");
        frame.setContentPane(new MinMaxGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void onBerechne() {
        taNumbers.setText("");

        MinMaxBL minMaxBl = new MinMaxBL();
        int[] feld = minMaxBl.getFeld();

        for (int i = 0; i < feld.length; i++) {
            if ((i + 1) % 10 != 0) {
                taNumbers.setText(taNumbers.getText() + String.format("%03d,", feld[i]));
            } else {
                taNumbers.setText(taNumbers.getText() + String.format("%03d\n", feld[i]));
            }
        }

        minMaxBl.berechneMinMax();

        tfGreatest.setText(String.valueOf(minMaxBl.getMax()));
        tfSmallest.setText(String.valueOf(minMaxBl.getMin()));
    }


}
