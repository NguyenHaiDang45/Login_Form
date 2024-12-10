package Program.BMICalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {
    private JTextField weightField;
    private JTextField heightField;
    private JLabel resultLabel;

    public BMICalculator() {
        // Tạo cửa sổ chính
        this.setTitle("BMI Calculator");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(5, 1, 10, 10));

        // Dòng 1: Nhập cân nặng
        JPanel weightPanel = new JPanel(new FlowLayout());
        JLabel weightLabel = new JLabel("Weight (kg):");
        weightField = new JTextField(10);
        weightPanel.add(weightLabel);
        weightPanel.add(weightField);
        this.add(weightPanel);

        // Dòng 2: Nhập chiều cao
        JPanel heightPanel = new JPanel(new FlowLayout());
        JLabel heightLabel = new JLabel("Height (m):");
        heightField = new JTextField(10);
        heightPanel.add(heightLabel);
        heightPanel.add(heightField);
        this.add(heightPanel);

        // Dòng 3: Nút tính toán
        JButton calculateButton = new JButton("Calculate BMI");
        calculateButton.addActionListener(new CalculateBMIListener());
        this.add(calculateButton);

        // Dòng 4: Hiển thị kết quả BMI
        resultLabel = new JLabel("Your BMI will appear here.", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        this.add(resultLabel);

        // Dòng 5: Ghi chú
        JLabel noteLabel = new JLabel("BMI Categories: Underweight < 18.5 | Normal 18.5–24.9 | Overweight 25–29.9 | Obese >= 30", SwingConstants.CENTER);
        noteLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        this.add(noteLabel);

        this.setVisible(true);
    }

    // Lớp nội bộ để xử lý sự kiện nút nhấn
    private class CalculateBMIListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Lấy cân nặng và chiều cao từ người dùng
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());

                // Tính BMI
                double bmi = weight / (height * height);
                String category;

                // Phân loại BMI
                if (bmi < 18.5) {
                    category = "Underweight";
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    category = "Normal";
                } else if (bmi >= 25 && bmi <= 29.9) {
                    category = "Overweight";
                } else {
                    category = "Obese";
                }

                // Hiển thị kết quả
                resultLabel.setText(String.format("Your BMI: %.2f (%s)", bmi, category));
            } catch (NumberFormatException ex) {
                // Xử lý lỗi nhập liệu
                JOptionPane.showMessageDialog(null, "Please enter valid numbers for weight and height.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
