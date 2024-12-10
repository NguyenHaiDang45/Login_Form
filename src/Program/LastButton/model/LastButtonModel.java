package Program.LastButton.model;

public class LastButtonModel {
    private int value;

    public LastButtonModel(int value) {
        this.value = value;
    }

    public LastButtonModel() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setValue1() {
        this.setValue(1);
    }

    public void setValue2() {
        this.setValue(2);
    }

    public void setValue3() {
        this.setValue(3);
    }

    public void setValue4() {
        this.setValue(4);
    }
}
