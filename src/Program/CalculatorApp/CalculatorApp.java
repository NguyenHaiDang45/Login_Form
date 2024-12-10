package Program.CalculatorApp;

import javax.swing.*;
import java.awt.*;

public class CalculatorApp extends JFrame{
    private JTextField textField;
    private double firstNumber;
    private double secondNumber;
    private String operator;

    public void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
               this.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public CalculatorApp() {
        initialize();
    }

    private void initialize() {
        this.setTitle("Calculator");
        this.setBounds(100, 100, 400, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);
        this.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            panel.add(button);

            button.addActionListener(e -> handleButtonPress(label));
        }

        this.add(panel, BorderLayout.CENTER);

        JButton clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 24));
        clearButton.addActionListener(e -> textField.setText(""));
        this.add(clearButton, BorderLayout.SOUTH);
    }

    private void handleButtonPress(String label) {
        if (label.equals("=")) {
            secondNumber = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    textField.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    textField.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "*":
                    textField.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber != 0) {
                        textField.setText(String.valueOf(firstNumber / secondNumber));
                    } else {
                        textField.setText("Error");
                    }
                    break;
                default:
                    break;
            }
        } else if (label.equals("+") || label.equals("-") || label.equals("*") || label.equals("/")) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = label;
            textField.setText("");
        } else {
            textField.setText(textField.getText() + label);
        }
    }
}

