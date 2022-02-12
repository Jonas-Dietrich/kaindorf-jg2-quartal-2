package gui;

import javax.swing.*;

public class DateTimeFormaterGUI {
    private JPanel jpRoot;
    private JPanel jpOutputCheckboxes;
    private JPanel jpInputValues;
    private JPanel jpFormatting;
    private JCheckBox cbDate;
    private JCheckBox cbTime;
    private JTextField tfDay;
    private JTextField tfMonth;
    private JTextField tfYear;
    private JTextField tfHour;
    private JTextField tfMinute;
    private JLabel lbDay;
    private JLabel lbMonth;
    private JLabel lbYear;
    private JLabel lbHour;
    private JLabel lbMinute;
    private JTextField tfFormat;
    private JButton btFormat;

    public static void main(String[] args) {
        JFrame frame = new JFrame("DateTimeFormaterGUI");
        frame.setContentPane(new DateTimeFormaterGUI().jpRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
