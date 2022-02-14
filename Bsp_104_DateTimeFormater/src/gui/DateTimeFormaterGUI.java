package gui;

import bl.DateTimeFormaterBL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

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

    public DateTimeFormaterGUI() {
        btFormat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onFormat();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DateTimeFormaterGUI");
        frame.setContentPane(new DateTimeFormaterGUI().jpRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void onFormat() {
        String formatStr = "";

        if (cbDate.isSelected()) {
            formatStr += "D";
        }
        if (cbTime.isSelected()) {
           formatStr += "T";
        }

        if (formatStr != "") {
            DateTimeFormaterBL dtfBl = new DateTimeFormaterBL();

            try {
                switch (formatStr) {
                    case "D":
                        tfFormat.setText(dtfBl.format(formatStr, Integer.parseInt(tfDay.getText()), Integer.parseInt(tfMonth.getText()),
                                Integer.parseInt(tfYear.getText())));
                        break;
                    case "T":
                        tfFormat.setText(dtfBl.format(formatStr, Integer.parseInt(tfHour.getText()), Integer.parseInt(tfMinute.getText())));
                        break;
                    case "DT":
                        tfFormat.setText(dtfBl.format(formatStr, Integer.parseInt(tfDay.getText()),
                                Integer.parseInt(tfMonth.getText()), Integer.parseInt(tfYear.getText()),
                                Integer.parseInt(tfHour.getText()), Integer.parseInt(tfMinute.getText())));
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Bitte alle Eingabefelder im korrekten Format einfügen");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Mindestens eine Checkbox muss ausgewählt sein!");
        }
    }
}
