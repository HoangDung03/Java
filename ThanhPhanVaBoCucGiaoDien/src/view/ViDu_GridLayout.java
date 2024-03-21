package view;

import javax.swing.*;
import java.awt.*;

public class ViDu_GridLayout extends JFrame {
    public ViDu_GridLayout(){
        this.setTitle("ViDu_GridLayout");
        this.setSize(800, 600);
        // Can giua cua so
        this.setLocationRelativeTo(null);

        // Set Layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout_1 = new GridLayout(4,4);
        GridLayout gridLayout_2 = new GridLayout(4,4,25,25);

//        this.setLayout(gridLayout);
//        this.setLayout(gridLayout_1);
        this.setLayout(gridLayout_2);

//        JButton jButton_1 = new JButton("1");
//        JButton jButton_2 = new JButton("2");
//        JButton jButton_3 = new JButton("3");

        for (int i = 1; i < 17; i++) {
            JButton jButton = new JButton(i+"");
            this.add(jButton);
        }
        // them thanh phan
//        this.add(jButton_1);
//        this.add(jButton_2);
//        this.add(jButton_3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_GridLayout();
    }


}
