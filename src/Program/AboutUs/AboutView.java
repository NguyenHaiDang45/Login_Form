package Program.AboutUs;

import javax.swing.*;
import java.awt.*;

public class AboutView extends JFrame {


    public AboutView() {
        this.setTitle("About Me");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel main_panel = new JPanel(null);

        Font font = new Font("Arial", Font.ITALIC, 12);
        Font font1 = new Font("Arial", Font.BOLD, 14);

        JLabel name = new JLabel("Tên: Nguyễn Hải Đăng");
        name.setBounds(100, 60, 200, 20);
        name.setFont(font1);
        JLabel id = new JLabel("MSV: 24ITB242");
        id.setBounds(100, 90, 200, 20);
        id.setFont(font1);
        JLabel classs = new JLabel("Lớp: 24IT5");
        classs.setBounds(100, 120, 200, 20);
        classs.setFont(font1);
        JLabel mail = new JLabel("Gmail: dangnh.24itb@vku.udn.vn");
        mail.setBounds(100, 150, 300, 20);
        mail.setFont(font1);

        main_panel.add(name);
        main_panel.add(id);
        main_panel.add(classs);
        main_panel.add(mail);

        JPanel copy_panel = new JPanel(new GridLayout());
        JLabel copyright = new JLabel("                                      Copyright by KoPingDang");
        copyright.setFont(font);
        copy_panel.add(copyright);

        this.setLayout(new BorderLayout());
        this.add(main_panel, BorderLayout.CENTER);
        this.add(copy_panel, BorderLayout.SOUTH, JLabel.CENTER);
        this.setVisible(true);
    }
}
