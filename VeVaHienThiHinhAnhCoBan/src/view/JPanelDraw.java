package view;

import javax.swing.*;
import java.awt.*;

public class JPanelDraw extends JPanel {

    public JPanelDraw(){
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(15,15,50,150);

        g.setColor(Color.BLUE);
        g.drawOval(255,255,50,50);

        g.setColor(Color.GREEN);
        g.drawRect(45,200,30,90);

        g.setColor(Color.PINK);
        g.fillOval(400,300,50,50);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(100,100,100,150);

        g.setColor(Color.PINK);
        g.drawString("HELLO", 400,250);
    }

    public static void main(String[] args) {
        new DrawView();
    }

}
