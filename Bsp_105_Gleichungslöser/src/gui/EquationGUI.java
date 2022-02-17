package gui;

import javax.swing.*;

public class EquationGUI {
    private JPanel jpMain;
    private JTextArea taEquation;
    private JButton btNum7;
    private JButton btNum8;
    private JButton btNum9;
    private JButton btXQuadrat;
    private JButton btX;
    private JButton btPlus;
    private JButton btMinus;
    private JButton btNum4;
    private JButton btNum5;
    private JButton btNum6;
    private JButton btNum1;
    private JButton btNum2;
    private JButton btNum3;
    private JButton btNum0;
    private JButton btEquals0;
    private JButton btClear;


    public static void main(String[] args) {
        JFrame frame = new JFrame("EquationGUI");
        frame.setContentPane(new EquationGUI().jpMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
