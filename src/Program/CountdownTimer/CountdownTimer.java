package Program.CountdownTimer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountdownTimer extends JFrame{
    private JTextField inputField;
    private JLabel timerLabel;
    private Timer timer;
    private int secondsLeft;

    public CountdownTimer() {
        this.setTitle("Countdown Timer");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        JLabel label = new JLabel("Enter seconds:");
        label.setBounds(20, 20, 100, 30);
        this.add(label);

        inputField = new JTextField();
        inputField.setBounds(130, 20, 100, 30);
        this.add(inputField);

        JButton startButton = new JButton("Start");
        startButton.setBounds(100, 70, 80, 30);
        this.add(startButton);

        timerLabel = new JLabel("Time left: 0 seconds", SwingConstants.CENTER);
        timerLabel.setBounds(50, 120, 200, 30);
        this.add(timerLabel);

        startButton.addActionListener(new StartButtonListener());

        this.setVisible(true);
    }

    private class StartButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                secondsLeft = Integer.parseInt(inputField.getText());
                timerLabel.setText("Time left: " + secondsLeft + " seconds");

                timer = new Timer(1000, new TimerActionListener());
                timer.start();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class TimerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (secondsLeft > 0) {
                secondsLeft--;
                timerLabel.setText("Time left: " + secondsLeft + " seconds");
            } else {
                timer.stop();
                JOptionPane.showMessageDialog(null, "Time's up!", "Countdown Complete", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new CountdownTimer();
    }
}

