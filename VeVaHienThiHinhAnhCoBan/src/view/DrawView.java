package view;

import javax.swing.*;
import java.awt.*;

public class DrawView extends JFrame {
    public DrawView(){
        this.setTitle("DRAW");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanelDraw jPanelDraw = new JPanelDraw();

        this.setLayout(new BorderLayout());
        this.add(jPanelDraw, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
