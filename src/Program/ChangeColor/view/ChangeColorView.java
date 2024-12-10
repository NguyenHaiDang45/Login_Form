package Program.ChangeColor.view;

import Program.ChangeColor.controller.ChangeColorListener;
import Program.ChangeColor.model.ChangeColorModel;

import javax.swing.*;
import java.awt.*;

public class ChangeColorView extends JFrame {
    private ChangeColorModel changeColorModel;
    private JLabel jLabel;

    public ChangeColorView(){
        this.changeColorModel = new ChangeColorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Change Color");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font fontText = new Font("Arial", Font.BOLD, 90);
        jLabel = new JLabel("TEXT", JLabel.CENTER);
        jLabel.setFont(fontText);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 3, 30, 30));

        Font font = new Font("Arial", Font.BOLD, 18);

        ChangeColorListener changeColorListener = new ChangeColorListener(this);

        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.RED);
        jButton_text_red.addActionListener(changeColorListener);

        JButton jButton_text_pink = new JButton("Pink Text");
        jButton_text_pink.setFont(font);
        jButton_text_pink.setForeground(Color.PINK);
        jButton_text_pink.addActionListener(changeColorListener);

        JButton jButton_text_green = new JButton("Green Text");
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.GREEN);
        jButton_text_green.addActionListener(changeColorListener);

        JButton jButton_bg_red = new JButton("Red Background");
        jButton_bg_red.setFont(font);
        jButton_bg_red.setBackground(Color.RED);
        jButton_bg_red.setOpaque(true);
        jButton_bg_red.setBorderPainted(false);
        jButton_bg_red.addActionListener(changeColorListener);

        JButton jButton_bg_pink = new JButton("Pink Background");
        jButton_bg_pink.setFont(font);
        jButton_bg_pink.setBackground(Color.PINK);
        jButton_bg_pink.setOpaque(true);
        jButton_bg_pink.setBorderPainted(false);
        jButton_bg_pink.addActionListener(changeColorListener);

        JButton jButton_bg_green = new JButton("Green Background");
        jButton_bg_green.setFont(font);
        jButton_bg_green.setBackground(Color.GREEN);
        jButton_bg_green.setOpaque(true);
        jButton_bg_green.setBorderPainted(false);
        jButton_bg_green.addActionListener(changeColorListener);

        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_pink);
        jPanel.add(jButton_text_green);
        jPanel.add(jButton_bg_red);
        jPanel.add(jButton_bg_pink);
        jPanel.add(jButton_bg_green);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void change_T_Color(Color color){
        this.jLabel.setForeground(color);
    }

    public void change_BG_Color(Color color){
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }

}
