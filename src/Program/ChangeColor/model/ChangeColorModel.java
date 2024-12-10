package Program.ChangeColor.model;

import java.awt.*;

public class ChangeColorModel {
    private Color foreGround;
    private Color backGround;
    private boolean opaque;

    public ChangeColorModel() {
        this.foreGround = Color.BLACK;
        this.backGround = Color.WHITE;
        this.opaque = true;
    }

    public Color getForeGround() {
        return foreGround;
    }

    public void setForeGround(Color foreGround) {
        this.foreGround = foreGround;
    }

    public Color getBackGround() {
        return backGround;
    }

    public void setBackGround(Color backGround) {
        this.backGround = backGround;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }
}
