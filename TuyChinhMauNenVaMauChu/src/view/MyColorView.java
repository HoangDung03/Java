package view;

import controller.MyColorListener;
import model.MyColorModel;

import javax.swing.*;
import java.awt.*;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;
    public MyColorView(){
        this.myColorModel = new MyColorModel();
        this.init();
    }

    private void init() {
        this.setTitle("My Color");
        this.setSize(900,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font font_text = new Font("Arial", Font.BOLD, 100);
        jLabel = new JLabel("TEXT");
        jLabel.setFont(font_text);
        jLabel.setForeground(Color.BLACK);
        jLabel.setBackground(Color.WHITE);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,3));

        Font font = new Font("Arial", Font.BOLD, 20);

        MyColorListener myColorListener = new MyColorListener(this);

        // mau chu
        JButton jButton_tRed = new JButton("RED TEXT");
        jButton_tRed.setFont(font);
        jButton_tRed.setForeground(Color.RED);
        jButton_tRed.addActionListener(myColorListener);

        JButton jButton_tGreen = new JButton("GREEN TEXT");
        jButton_tGreen.setFont(font);
        jButton_tGreen.setForeground(Color.GREEN);
        jButton_tGreen.addActionListener(myColorListener);

        JButton jButton_tBlue = new JButton("BLUE TEXT");
        jButton_tBlue.setFont(font);
        jButton_tBlue.setForeground(Color.BLUE);
        jButton_tBlue.addActionListener(myColorListener);

        // mau nen
        JButton jButton_bRed = new JButton("RED BACKGROUND");
        jButton_bRed.setFont(font);
        jButton_bRed.setBackground(Color.RED);
        jButton_bRed.setOpaque(true);
        jButton_bRed.setBorderPainted(false);
        jButton_bRed.addActionListener(myColorListener);

        JButton jButton_bGreen = new JButton("GREEN BACKGROUND");
        jButton_bGreen.setFont(font);
        jButton_bGreen.setBackground(Color.GREEN);
        jButton_bGreen.setOpaque(true);
        jButton_bGreen.setBorderPainted(false);
        jButton_bGreen.addActionListener(myColorListener);

        JButton jButton_bBlue = new JButton("BLUE BACKGROUND");
        jButton_bBlue.setFont(font);
        jButton_bBlue.setBackground(Color.BLUE);
        jButton_bBlue.setOpaque(true);
        jButton_bBlue.setBorderPainted(false);
        jButton_bBlue.addActionListener(myColorListener);

        JButton jButton_reset = new JButton("RESET");
        jButton_reset.setFont(font);
        jButton_reset.addActionListener(myColorListener);

        // dua nut vao jPannel
        jPanel.add(jButton_tRed);
        jPanel.add(jButton_tGreen);
        jPanel.add(jButton_tBlue);
        jPanel.add(jButton_bRed);
        jPanel.add(jButton_bGreen);
        jPanel.add(jButton_bBlue);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);
        this.add(jButton_reset, BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void changeColor(Color color) {
        this.jLabel.setForeground(color);

    }
    public void changeBackgroundColor(Color color){
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }

    public void resetColor(){
        this.myColorModel.getFbground();
        this.jLabel.setForeground(Color.BLACK);
        this.jLabel.setBackground(Color.WHITE);
        this.jLabel.setOpaque(true);


//        this.myColorModel.getBackground();
    }

}
