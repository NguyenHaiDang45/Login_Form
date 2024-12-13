package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.net.URL;

public class SignUpView extends JFrame {

    private JTextField jt_user;
    private JPasswordField jt_pw;

    public SignUpView() {
        this.init();
    }

    private void init() {
        //JFrame
        this.setTitle("Menu Application");
        this.setSize(350, 420);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setShape(new RoundRectangle2D.Double(0, 0, 350, 420, 45, 45));

        //SignUp text
        JPanel jp_text = new JPanel(new FlowLayout(FlowLayout.CENTER));

        URL url = SignUpView.class.getResource("icon3.png");
        Image img = Toolkit.getDefaultToolkit().createImage(url);

        this.setIconImage(img);

        Font font1 = new Font("Bitter", Font.BOLD, 70);
        JLabel jl_text = new JLabel("SignUp", JLabel.CENTER);
        jl_text.setFont(font1);
        jl_text.setForeground(Color.decode("#005500"));

        jp_text.setBackground(Color.decode("#FF9999"));
        jp_text.add(jl_text);

        //Font chung
        Font font_chung = new Font("Open Sans", Font.BOLD, 14);

        //User name
        JPanel jp_user = new JPanel(new GridLayout(2, 1, 5, 5));

        JLabel jl_user = new JLabel("Username");
        jl_user.setFont(font_chung);
        jt_user = new JTextField(30);
        jt_user.setFont(font_chung);

        jp_user.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        jp_user.setBackground(Color.decode("#FF9999"));
        jp_user.add(jl_user);
        jp_user.add(jt_user);

        //Password
        JPanel jp_pw = new JPanel(new GridLayout(2, 1, 5, 5));

        JLabel jl_pw = new JLabel("Password");
        jl_pw.setFont(font_chung);
        jt_pw = new JPasswordField(30);
        jt_pw.setFont(font_chung);

        jp_pw.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        jp_pw.setBackground(Color.decode("#FF9999"));
        jp_pw.add(jl_pw);
        jp_pw.add(jt_pw);

        //Button
        JPanel jp_button = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        URL url2 = SignUpView.class.getResource("icon2.png");
        ImageIcon img2 = new ImageIcon(url2);

        Image scaledImage = img2.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        JButton jb_signIn = new JButton("Log in", resizedIcon);
        jb_signIn.setPreferredSize(new Dimension(100, 30));
        jb_signIn.setFont(font_chung);

        jb_signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = jt_user.getText();
                String pw = new String(jt_pw.getPassword());

                if (user.equals("nguyenhaidang") && pw.equals("24itb242")) {
                    dispose();
                    MenuView menuView = new MenuView();
                    menuView.setVisible(true);
                } else JOptionPane.showMessageDialog(null, "Username or Password is incorrect!");
            }
        });

        jp_button.setBackground(Color.decode("#FF9999"));
        jp_button.add(jb_signIn);

        //JFrame
        this.setLayout(new GridLayout(4, 1));
        this.add(jp_text);
        this.add(jp_user);
        this.add(jp_pw);
        this.add(jp_button);
        this.getContentPane().setBackground(Color.decode("#FF9999"));
        this.setVisible(true);
    }
}
