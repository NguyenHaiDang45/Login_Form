package Program.MyCalculate.view;

import Program.MyCalculate.controller.MyCalculateListener;
import Program.MyCalculate.model.MyCalculateModel;

import javax.swing.*;
import java.awt.*;

public class MyCalculateView extends JFrame {
    private MyCalculateModel myCalculateModel;
    private JTextField jt_1stvalue;
    private JTextField jt_2ndvalue;
    private JTextField jt_result;

    public MyCalculateView(){
        this.myCalculateModel = new MyCalculateModel();
        this.init();
    }

    private void init() {
        this.setTitle("My Calculator");
        this.setSize(450, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 16);

        JPanel jPanel_display = new JPanel();
        jPanel_display.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel jLabel_1stvalue = new JLabel("      First value");
        jLabel_1stvalue.setFont(font);
        JLabel jLabel_2ndvalue = new JLabel("      Second value");
        jLabel_2ndvalue.setFont(font);
        JLabel jLabel_result = new JLabel("      Result");
        jLabel_result.setFont(font);

        jt_1stvalue = new JTextField(50);
        jt_1stvalue.setFont(font);
        jt_2ndvalue = new JTextField(50);
        jt_2ndvalue.setFont(font);
        jt_result = new JTextField(50);
        jt_result.setFont(font);

        jPanel_display.add(jLabel_1stvalue);
        jPanel_display.add(jt_1stvalue);
        jPanel_display.add(jLabel_2ndvalue);
        jPanel_display.add(jt_2ndvalue);
        jPanel_display.add(jLabel_result);
        jPanel_display.add(jt_result);

        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new FlowLayout());

        MyCalculateListener myCalculateListener = new MyCalculateListener(this);

        JButton jButton_cong = new JButton("Addition");
        jButton_cong.setFont(font);
        jButton_cong.addActionListener(myCalculateListener);
        JButton jButton_tru = new JButton("Subtract");
        jButton_tru.setFont(font);
        jButton_tru.addActionListener(myCalculateListener);
        JButton jButton_nhan = new JButton("Multiplication");
        jButton_nhan.setFont(font);
        jButton_nhan.addActionListener(myCalculateListener);
        JButton jButton_chia = new JButton("Division");
        jButton_chia.setFont(font);
        jButton_chia.addActionListener(myCalculateListener);

        jPanel_button.add(jButton_cong);
        jPanel_button.add(jButton_tru);
        jPanel_button.add(jButton_nhan);
        jPanel_button.add(jButton_chia);


        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanel_display, BorderLayout.CENTER);
        this.add(jPanel_button, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void cong(){
        double firstV = Double.valueOf(jt_1stvalue.getText());
        double secondV = Double.valueOf(jt_2ndvalue.getText());
        this.myCalculateModel.setValue_1(firstV);
        this.myCalculateModel.setValue_2(secondV);
        this.myCalculateModel.phep_cong();
        this.jt_result.setText(this.myCalculateModel.getResult() + "");
    }

    public void tru(){
        double firstV = Double.valueOf(jt_1stvalue.getText());
        double secondV = Double.valueOf(jt_2ndvalue.getText());
        this.myCalculateModel.setValue_1(firstV);
        this.myCalculateModel.setValue_2(secondV);
        this.myCalculateModel.phep_tru();
        this.jt_result.setText(this.myCalculateModel.getResult() + "");
    }

    public void nhan(){
        double firstV = Double.valueOf(jt_1stvalue.getText());
        double secondV = Double.valueOf(jt_2ndvalue.getText());
        this.myCalculateModel.setValue_1(firstV);
        this.myCalculateModel.setValue_2(secondV);
        this.myCalculateModel.phep_nhan();
        this.jt_result.setText(this.myCalculateModel.getResult() + "");
    }

    public void chia(){
        double firstV = Double.valueOf(jt_1stvalue.getText());
        double secondV = Double.valueOf(jt_2ndvalue.getText());
        this.myCalculateModel.setValue_1(firstV);
        this.myCalculateModel.setValue_2(secondV);
        this.myCalculateModel.phep_chia();
        this.jt_result.setText(this.myCalculateModel.getResult() + "");
    }
}
