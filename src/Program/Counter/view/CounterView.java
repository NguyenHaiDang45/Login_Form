package Program.Counter.view;

import Program.Counter.controller.CounterListener;
import Program.Counter.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame{
    private CounterModel counterModel;
    private JButton jButton_down;
    private JButton jButton_up;
    private JButton jButton_reset;
    private JLabel jLabel_value;

    public CounterView(){
        this.counterModel = new CounterModel();
        this.init();

        this.setVisible(true);
    }

    public void init(){
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ActionListener ac = new CounterListener(this);

        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);

        jButton_down = new JButton("DOWN");
        jButton_down.addActionListener(ac);

        jButton_reset = new JButton("Reset");
        jButton_reset.addActionListener(ac);

        jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);

        JPanel jPanel = new JPanel(new BorderLayout());

        jPanel.add(jButton_up, BorderLayout.EAST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_down, BorderLayout.WEST);
        jPanel.add(jButton_reset, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }

    public void degrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }

    public void reset(){
        this.counterModel.reset();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
}
