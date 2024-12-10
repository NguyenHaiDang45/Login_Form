package Program.MyCalculate.test;

import Program.MyCalculate.view.MyCalculateView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new MyCalculateView();
    }
}
