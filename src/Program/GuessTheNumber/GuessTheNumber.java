package Program.GuessTheNumber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessTheNumber extends JFrame{
    private JTextField inputField;
    private JLabel resultLabel;
    private int targetNumber;

    public GuessTheNumber() {
        targetNumber = (int) (Math.random() * 100) + 1;

        this.setTitle("Guess The Number");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        JLabel label = new JLabel("Enter your guess (1-100):");
        label.setBounds(20, 20, 200, 30);
        this.add(label);

        inputField = new JTextField();
        inputField.setBounds(20, 60, 100, 30);
        this.add(inputField);

        JButton checkButton = new JButton("Check");
        checkButton.setBounds(140, 60, 100, 30);
        this.add(checkButton);

        resultLabel = new JLabel("Result: ", SwingConstants.CENTER);
        resultLabel.setBounds(20, 110, 250, 30);
        this.add(resultLabel);

        checkButton.addActionListener(new CheckButtonListener());

        this.setVisible(true);
    }

    private class CheckButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int guess = Integer.parseInt(inputField.getText());
                if (guess < targetNumber) {
                    resultLabel.setText("Result: Too low!");
                } else if (guess > targetNumber) {
                    resultLabel.setText("Result: Too high!");
                } else {
                    resultLabel.setText("Result: Correct!");
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number.");
                    targetNumber = (int) (Math.random() * 100) + 1; // Reset the game
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new GuessTheNumber();
    }
}

