package view;

import controller.TextListener;
import model.TextModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;

public class TextView extends JFrame {
    private TextModel textModel;
    private JLabel jLabel;

    public TextView(){
        textModel = new TextModel();
        this.init();
    }

    private void init() {
        this.setTitle("Text");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Font font = new Font("Arial",Font.BOLD, 20);

        TextListener textListener = new TextListener(this);

        JRadioButton rd_Red = new JRadioButton("Red");
        rd_Red.addActionListener(textListener);
        rd_Red.setFont(font);
        JRadioButton rd_Black = new JRadioButton("Black");
        rd_Black.addActionListener(textListener);
        rd_Black.setFont(font);
        JRadioButton rd_Yellow = new JRadioButton("Yellow");
        rd_Yellow.addActionListener(textListener);
        rd_Yellow.setFont(font);
        JRadioButton rd_Orange = new JRadioButton("Orange");
        rd_Orange.addActionListener(textListener);
        rd_Orange.setFont(font);
        JRadioButton rd_Green = new JRadioButton("Green");
        rd_Green.addActionListener(textListener);
        rd_Green.setFont(font);

        JPanel jPanel_radio = new JPanel();
        jPanel_radio.setLayout(new GridLayout(1,5));
        jPanel_radio.add(rd_Red);
        jPanel_radio.add(rd_Black);
        jPanel_radio.add(rd_Yellow);
        jPanel_radio.add(rd_Orange);
        jPanel_radio.add(rd_Green);

        ButtonGroup group = new ButtonGroup();
        group.add(rd_Red);
        group.add(rd_Black);
        group.add(rd_Yellow);
        group.add(rd_Orange);
        group.add(rd_Green);

        JPanel jPanel_label = new JPanel();
        jLabel = new JLabel("Learn Java!");
        jLabel.setFont(font);
        jLabel.setForeground(Color.BLACK);
        jPanel_label.setLayout(new BorderLayout());
        jPanel_label.setBackground(Color.GRAY);
        jPanel_label.add(jLabel, BorderLayout.CENTER);

        JPanel jPanel_btn = new JPanel();
        JPanel jPanel_magin1 = new JPanel();
        JPanel jPanel_magin2 = new JPanel();
        JPanel jPanel_magin3 = new JPanel();
        jPanel_btn.setLayout(new GridLayout(1,5));
        Button button_1 = new Button("<=");
        button_1.addActionListener(textListener);
        button_1.setFont(font);
        Button button_2 = new Button("=>");
        button_2.addActionListener(textListener);
        button_2.setFont(font);
        jPanel_btn.add(jPanel_magin1);
        jPanel_btn.add(button_1);
        jPanel_btn.add(jPanel_magin2);
        jPanel_btn.add(button_2);
        jPanel_btn.add(jPanel_magin3);

        this.setLayout(new BorderLayout());
        this.add(jPanel_radio, BorderLayout.NORTH);
        this.add(jPanel_label,BorderLayout.CENTER);
        this.add(jPanel_btn, BorderLayout.SOUTH);


        this.setVisible(true);
    }

    public void changeColor(Color color){
        this.jLabel.setForeground(color);
    }

    public void moveLaberRight(){
        int current_x =jLabel.getLocation().x;
        jLabel.setLocation(current_x + 20, jLabel.getLocation().y);
    }

    public void moveLaberLeft(){
        int current_x =jLabel.getLocation().x;
        jLabel.setLocation(current_x - 20, jLabel.getLocation().y);
    }
}
