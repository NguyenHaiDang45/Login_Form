package Program.ChangeColor.controller;

import Program.ChangeColor.view.ChangeColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColorListener implements ActionListener {
    private ChangeColorView changeColorView;

    public ChangeColorListener(ChangeColorView changeColorView) {
        this.changeColorView = changeColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("Red Text")) {
            this.changeColorView.change_T_Color(Color.RED);
        } else if (src.equals("Pink Text")) {
            this.changeColorView.change_T_Color(Color.PINK);
        } else if (src.equals("Green Text")) {
            this.changeColorView.change_T_Color(Color.GREEN);
        }

        if (src.equals("Red Background")) {
            this.changeColorView.change_BG_Color(Color.RED);
        } else if (src.equals("Pink Background")) {
            this.changeColorView.change_BG_Color(Color.PINK);
        } else if (src.equals("Green Background")) {
            this.changeColorView.change_BG_Color(Color.GREEN);
        }
    }
}
