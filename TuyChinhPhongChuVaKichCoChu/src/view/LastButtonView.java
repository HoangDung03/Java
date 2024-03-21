package view;

import controller.LastButtonListener;
import model.LastButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LastButtonView extends JFrame {
    private LastButton lastButton;
    private JLabel jLabel;

    public LastButtonView (){
        this.lastButton = new LastButton();
        this.init();
    }

    private void init() {
        this.setTitle("Last Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);

        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2,2));

        // Tạo Listener
        LastButtonListener lbl = new LastButtonListener(this);

        // Tạo phông chữ
        Font font = new Font("Arial", Font.BOLD, 30);

        // Gán phông chữ cho từng nut
        JButton jButton_1 = new JButton("1");
        jButton_1.setFont(font);
        jButton_1.addActionListener(lbl);
        JButton jButton_2 = new JButton("2");
        jButton_2.setFont(font);
        jButton_2.addActionListener(lbl);
        JButton jButton_3 = new JButton("3");
        jButton_3.setFont(font);
        jButton_3.addActionListener(lbl);
        JButton jButton_4 = new JButton("4");
        jButton_4.setFont(font);
        jButton_4.addActionListener(lbl);

        jPanel_Center.add(jButton_1);
        jPanel_Center.add(jButton_2);
        jPanel_Center.add(jButton_3);
        jPanel_Center.add(jButton_4);

        JPanel jPanel_Footer = new JPanel();
        jLabel = new JLabel("------");
        jLabel.setFont(font);
        jPanel_Footer.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(jPanel_Center, BorderLayout.CENTER);
        this.add(jPanel_Footer, BorderLayout.SOUTH);
        this.setVisible(true);

    }
    public void changeTo_1(){
        this.lastButton.setValue_1();
        jLabel.setText("Last button: " + this.lastButton.getValue());
    }
    public void changeTo_2(){
        this.lastButton.setValue_2();
        jLabel.setText("Last button: " + this.lastButton.getValue());
    }
    public void changeTo_3(){
        this.lastButton.setValue_3();
        jLabel.setText("Last button: " + this.lastButton.getValue());
    }
    public void changeTo_4(){
        this.lastButton.setValue_4();
        jLabel.setText("Last button:" + this.lastButton.getValue());
    }

}
