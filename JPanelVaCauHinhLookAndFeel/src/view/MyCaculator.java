package view;

import javax.swing.*;
import java.awt.*;

public class MyCaculator extends JFrame {
    public MyCaculator(){
        this.setTitle("My Caculator");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // tao muc nhap text
        // 50 la so luong ky tu co the nhap
        JTextField jTextField = new JTextField(50);

        JPanel jPanel_head = new JPanel();

        // set layout cho jpanel_head
        jPanel_head.setLayout(new BorderLayout());
        // set vi tri cho jpanel_head
        jPanel_head.add(jTextField, BorderLayout.CENTER);

        // Tao cac nut
        JButton jButton_0 = new JButton("0");
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        JButton jButton_6 = new JButton("6");
        JButton jButton_7 = new JButton("7");
        JButton jButton_8 = new JButton("8");
        JButton jButton_9 = new JButton("9");
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("*");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");

        JPanel jPanel_buttons = new JPanel();
        // set layout cho jPanel_buttons
        jPanel_buttons.setLayout(new GridLayout(5,3));
        // Dua cac nut vao jPanel_buttons
        jPanel_buttons.add(jButton_0);
        jPanel_buttons.add(jButton_1);
        jPanel_buttons.add(jButton_2);
        jPanel_buttons.add(jButton_3);
        jPanel_buttons.add(jButton_4);
        jPanel_buttons.add(jButton_5);
        jPanel_buttons.add(jButton_6);
        jPanel_buttons.add(jButton_7);
        jPanel_buttons.add(jButton_8);
        jPanel_buttons.add(jButton_9);
        jPanel_buttons.add(jButton_cong);
        jPanel_buttons.add(jButton_tru);
        jPanel_buttons.add(jButton_nhan);
        jPanel_buttons.add(jButton_chia);
        jPanel_buttons.add(jButton_bang);

        this.setLayout(new BorderLayout());
        // dua phan nhap text len tren cung
        this.add(jPanel_head, BorderLayout.NORTH);
        // dua phan button vao ngay say phan text
        this.add(jPanel_buttons, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Su dung giao dien cua he dieu hanh
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyCaculator();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
