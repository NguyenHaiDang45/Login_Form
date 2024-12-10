package Program.UnitConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverter extends JFrame{
    private JTextField inputField;
    private JLabel resultLabel;
    private JComboBox<String> unitComboBox;

    public UnitConverter() {
        this.setTitle("Unit Converter");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        JLabel label = new JLabel("Enter value:");
        label.setBounds(20, 20, 100, 30);
        this.add(label);

        inputField = new JTextField();
        inputField.setBounds(130, 20, 100, 30);
        this.add(inputField);

        unitComboBox = new JComboBox<>(new String[]{"Meters to Kilometers", "Kilograms to Grams", "Minutes to Hours"});
        unitComboBox.setBounds(20, 60, 200, 30);
        this.add(unitComboBox);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(240, 60, 100, 30);
        this.add(convertButton);

        resultLabel = new JLabel("Result: ", SwingConstants.CENTER);
        resultLabel.setBounds(20, 110, 350, 30);
        this.add(resultLabel);

        convertButton.addActionListener(new ConvertButtonListener());

        this.setVisible(true);
    }

    private class ConvertButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double value = Double.parseDouble(inputField.getText());
                String selectedUnit = (String) unitComboBox.getSelectedItem();
                double result = 0;

                if (selectedUnit.equals("Meters to Kilometers")) {
                    result = value / 1000;
                } else if (selectedUnit.equals("Kilograms to Grams")) {
                    result = value * 1000;
                } else if (selectedUnit.equals("Minutes to Hours")) {
                    result = value / 60;
                }

                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new UnitConverter();
    }
}

