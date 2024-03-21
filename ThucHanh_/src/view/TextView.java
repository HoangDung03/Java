package view;

import controller.TextListener;
import model.TextModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextView extends JFrame {
    private TextModel textModel;
    private JLabel jLabel;
    private Button btn_1;
    private Button btn_2;


    public TextView() {
        this.textModel = new TextModel();
        this.init();
    }

    private void init() {
        this.setTitle("Text Color");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 20);

        JPanel jPanel_radio = new JPanel();

        TextListener textListener = new TextListener(this);

        JRadioButton red = new JRadioButton("red");
        red.setFont(font);
        red.addActionListener(textListener);
        JRadioButton black = new JRadioButton("black");
        black.setFont(font);
        black.addActionListener(textListener);
        JRadioButton yellow = new JRadioButton("yellow");
        yellow.setFont(font);
        yellow.addActionListener(textListener);
        JRadioButton orange = new JRadioButton("orange");
        orange.setFont(font);
        orange.addActionListener(textListener);
        JRadioButton green = new JRadioButton("green");
        green.setFont(font);
        green.addActionListener(textListener);

        jPanel_radio.add(red);
        jPanel_radio.add(black);
        jPanel_radio.add(yellow);
        jPanel_radio.add(orange);
        jPanel_radio.add(green);

        jPanel_radio.setLayout(new GridLayout(1, 5, 10, 10));

        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(black);
        group.add(yellow);
        group.add(orange);
        group.add(green);

        JPanel jPanel_label = new JPanel();
        jLabel = new JLabel("Programing is fun!");
        jLabel.setFont(font);
        jLabel.setForeground(Color.BLACK);
        jPanel_label.add(jLabel);
        jPanel_label.setLayout(new BorderLayout());
        jPanel_label.add(jLabel, BorderLayout.CENTER);
        jPanel_label.setBackground(Color.GRAY);

        btn_1 = new Button("<=");
        btn_1.setFont(font);
//        btn_1.addActionListener(textListener);
        btn_2 = new Button("=>");
        btn_2.setFont(font);
//        btn_2.addActionListener(textListener);
        JPanel jPanel_btn = new JPanel();
        jPanel_btn.add(btn_1);
        jPanel_btn.add(btn_2);
        jPanel_btn.setLayout(new GridLayout(1, 2, 20, 20));


        this.setLayout(new BorderLayout());
        this.add(jPanel_radio);
        this.add(jPanel_label);
        this.add(jPanel_btn);
        this.add(jPanel_radio, BorderLayout.NORTH);
        this.add(jPanel_label, BorderLayout.CENTER);
        this.add(jPanel_btn, BorderLayout.SOUTH);


        this.setVisible(true);


        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveLabelLeft();
            }
        });

        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveLabelRight();
            }
        });
    }

    private void moveLabelRight() {
        int currentX = jLabel.getLocation().x;
        jLabel.setLocation(currentX + 20, jLabel.getLocation().y);
    }

    private void moveLabelLeft() {
        int currentX = jLabel.getLocation().x;
        jLabel.setLocation(currentX - 20, jLabel.getLocation().y);
    }

    public void changeColor(Color color) {
        this.jLabel.setForeground(color);
    }
}
