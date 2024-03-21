package view;

import javax.swing.*;
import java.awt.*;

public class ViDu_BorderLayout extends JFrame {
    public ViDu_BorderLayout(){
        this.setTitle("ViDu_FlowLayout");
        this.setSize(600, 400);
        // Can giua cua so
        this.setLocationRelativeTo(null);

        // Set Layout
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout_2 = new BorderLayout(5,5);

        this.setLayout(borderLayout_2);

        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");

        // them thanh phan
        this.add(jButton_1, BorderLayout.NORTH);
        this.add(jButton_2, BorderLayout.SOUTH);
        this.add(jButton_3, BorderLayout.WEST);
        this.add(jButton_4, BorderLayout.EAST);
        this.add(jButton_5, BorderLayout.CENTER);


        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_BorderLayout();
    }


}
