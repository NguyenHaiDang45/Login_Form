package Program.ChangeColor.test;

import Program.ChangeColor.view.ChangeColorView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new ChangeColorView();
    }
}
