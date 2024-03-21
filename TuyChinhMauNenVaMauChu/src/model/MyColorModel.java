package model;

import java.awt.*;

public class MyColorModel {
    private Color fbground;
    private Color background;
    private boolean opaque;

    public MyColorModel() {
        this.fbground = Color.BLACK;
        this.background = Color.WHITE;
        this.opaque = true;
    }

    public Color getFbground() {
        return fbground;
    }

    public void setFbground(Color fbground) {
        this.fbground = fbground;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }



}
