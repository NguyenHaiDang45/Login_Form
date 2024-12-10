package Program.Counter.controller;

import Program.Counter.view.CounterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class CounterListener implements Action {
    private CounterView ctv;

    public CounterListener(CounterView ctv){
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String src = e.getActionCommand();

        if (src.equals("UP")){
            this.ctv.increment();
        } else if (src.equals("DOWN")) {
            this.ctv.degrement();
        } else if (src.equals("Reset")){
            this.ctv.reset();
        }
    }

    @Override
    public Object getValue(String key) {
        return null;
    }

    @Override
    public void putValue(String key, Object value) {

    }

    @Override
    public void setEnabled(boolean b) {

    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }
}
