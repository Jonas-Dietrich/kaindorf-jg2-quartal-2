package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EulerGUI {
    private JPanel jpRoot;
    private JButton btCalculate;
    private JPanel jpChooseProblem;
    private JPanel jpResult;
    private JTextArea textArea1;
    private JCheckBox cbProblem1;
    private JCheckBox cbProblem9;
    private JCheckBox cbProblem20;
    private JCheckBox cbProblem24;
    private JCheckBox checkBox5;

    public EulerGUI() {
        btCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCalculate();
            }
        });
    }

    public void onCalculate() {
        if (cbProblem1.isSelected()) {

        }

        if (cbProblem9.isSelected()) {

        }

        if (cbProblem20.isSelected()) {

        }

        if (cbProblem24.isSelected()) {

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EulerGUI");
        frame.setContentPane(new EulerGUI().jpRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
