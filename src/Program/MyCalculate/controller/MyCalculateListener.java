package Program.MyCalculate.controller;

import Program.MyCalculate.view.MyCalculateView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculateListener implements ActionListener {
    private MyCalculateView myCalculateView;

    public MyCalculateListener(MyCalculateView myCalculateView){
        this.myCalculateView = myCalculateView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("Addition")) {
            this.myCalculateView.cong();
        } else if (src.equals("Subtract")) {
            this.myCalculateView.tru();
        } else if (src.equals("Multiplication")) {
            this.myCalculateView.nhan();
        } else if (src.equals("Division")) {
            this.myCalculateView.chia();
        }
    }
}
