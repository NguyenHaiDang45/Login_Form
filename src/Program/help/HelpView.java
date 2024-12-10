package Program.help;

import view.SignUpView;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class HelpView extends JFrame {

    public HelpView() {
        this.setTitle("Help for Menu Application");
        this.setSize(700, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        URL url = HelpView.class.getResource("icon_help.jpg");
        Image img = Toolkit.getDefaultToolkit().createImage(url);

        this.setIconImage(img);

        JPanel main_panel = new JPanel(null);

        Font font = new Font("Arial", Font.BOLD, 17);

        JLabel jLabel = new JLabel("Move your mouse to MenuBar and choose program which you want!!!");
        jLabel.setFont(font);
        jLabel.setBounds(60, 60, 680, 50);

        main_panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        main_panel.add(jLabel, JLabel.CENTER);


        this.setLayout(new BorderLayout());
        this.add(main_panel, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
