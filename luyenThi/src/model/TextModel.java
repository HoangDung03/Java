package model;

import java.awt.*;

public class TextModel {
    private Color fbg;
    private boolean opaque;
    private int x, y;

    public TextModel() {
        this.fbg = fbg;
        this.opaque = opaque;
        this.x = x;
        this.y = y;
    }

    public Color getFbg() {
        return fbg;
    }

    public void setFbg(Color fbg) {
        this.fbg = fbg;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

