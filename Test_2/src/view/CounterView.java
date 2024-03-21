package view;

import controller.CounterListener;
import model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JButton jButton_reset;
    private JLabel jLabel_value;

    public CounterView(){
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init(){
        this.setTitle("Counter");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);

        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);
        jButton_down = new JButton("DOWN");
        jButton_down.addActionListener(ac);
        jButton_reset = new JButton("RESET");
        jButton_reset.addActionListener(ac);
        jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jButton_down, BorderLayout.EAST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_reset, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);

    }

    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

    public void reset(){
        this.counterModel.reset();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

}
