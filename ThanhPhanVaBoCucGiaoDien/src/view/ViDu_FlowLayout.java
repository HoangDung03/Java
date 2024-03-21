package view;

import javax.swing.*;
import java.awt.*;

public class ViDu_FlowLayout extends JFrame {
    public ViDu_FlowLayout(){
        this.setTitle("ViDu_FlowLayout");
        this.setSize(600, 400);
        // Can giua cua so
        this.setLocationRelativeTo(null);

        // Set Layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 10, 10);

//        this.setLayout(flowLayout);
//        this.setLayout(flowLayout_1);
        this.setLayout(flowLayout_2);

        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");

        // them thanh phan
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_FlowLayout();
    }


}
