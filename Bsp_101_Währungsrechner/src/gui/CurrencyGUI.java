package gui;

import bl.CurrencyConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyGUI {
    private JLabel lbEuro;
    private JTextField tfEuro;
    private JLabel lbDollar;
    private JTextField tfDollar;
    private JButton btEuroToDollar;
    private JButton btDollarToEuro;
    private JPanel paMain;


    public CurrencyGUI() {
        btDollarToEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (tfDollar.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"Bitte alle Eingabefelder befüllen!");
                } else {
                    onBtDollarToEuro();
                }
            }
        });
        btEuroToDollar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (tfEuro.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"Bitte alle Eingabefelder befüllen!");
                } else {
                    onBtEuroToDollar();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CurrencyGUI");
        frame.setContentPane(new CurrencyGUI().paMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void onBtEuroToDollar() {
        CurrencyConverter curconv = new bl.CurrencyConverter();
        tfDollar.setText("" + curconv.euroToDollar(Double.parseDouble(tfEuro.getText())));
    }

    public void onBtDollarToEuro() {

    }



}
