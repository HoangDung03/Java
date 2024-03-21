package controller;

import view.MouseView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListeners implements MouseListener, MouseMotionListener {
    private MouseView mouseView;

    public MouseListeners(MouseView mouseView) {
        this.mouseView = mouseView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseView.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseView.entered();
        int x = e.getX();
        int y = e.getY();
        this.mouseView.update(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseView.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseView.update(x,y);
    }
}
