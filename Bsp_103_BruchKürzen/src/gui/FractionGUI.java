package gui;

import beans.Fraction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FractionGUI {
    private JPanel rootPanel;
    private JPanel jpInput;
    private JButton btReduce;
    private JPanel jpOutput;
    private JTextField tfNumeratorInput;
    private JTextField tfDenominatorInput;
    private JTextField tfNumeratorOutput;
    private JTextField tfDenominatorOutput;

    public FractionGUI() {
        btReduce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onReduce();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FractionGUI");
        frame.setContentPane(new FractionGUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void onReduce() {
        try {
            int numerator = Integer.parseInt(tfNumeratorInput.getText());
            int denominator = Integer.parseInt(tfDenominatorInput.getText());

            Fraction frac = new Fraction(numerator, denominator);
            frac.cancel();

            tfNumeratorOutput.setText(Integer.toString(frac.getNumerator()));
            tfDenominatorOutput.setText(Integer.toString(frac.getDenominator()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Bitte alle Eingabefelder ausfüllen!");
        }
    }

}
