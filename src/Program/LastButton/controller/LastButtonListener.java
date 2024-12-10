package Program.LastButton.controller;

import Program.LastButton.view.LastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonListener implements ActionListener {
    private LastButtonView lastButtonView;

    public LastButtonListener(LastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();

        if (nguonSuKien.equals("1")){
            this.lastButtonView.changeTo1();
        } else if (nguonSuKien.equals("2")){
            this.lastButtonView.changeTo2();
        } else if (nguonSuKien.equals("3")){
            this.lastButtonView.changeTo3();
        } else {
            this.lastButtonView.changeTo4();
        }
    }
}
