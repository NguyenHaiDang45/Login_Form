package Program.LastButton.test;

import Program.LastButton.view.LastButtonView;

import javax.swing.*;

public class LastButtonTest {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new LastButtonView();
    }
}
