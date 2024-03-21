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

    // Tạo giao diện:
    public void init(){
        this.setTitle("Counter");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // khai báo biến ActionListener từ lớp CounterListener và thêm (this) tức là lớp View vào
        ActionListener ac = new CounterListener(this);

        Font font = new Font("Arial", Font.BOLD, 20);

        // Tạo các nút
        jButton_up = new JButton("UP  ");
//        jButton_up.setSize(50,300);
        jButton_up.addActionListener(ac);
        jButton_up.setFont(font);
        jButton_down = new JButton("DOWN");
//        jButton_down.setSize(50,300);
        jButton_down.addActionListener(ac);
        jButton_down.setFont(font);
        jButton_reset = new JButton("RESET");
        jButton_reset.addActionListener(ac);
        jButton_reset.setFont(font);
//        jButton_up.setSize(400,50);
        jLabel_value = new JLabel(this.counterModel.getValue()+ "", JLabel.CENTER);
        jLabel_value.setFont(font);

        // tạo lớp Jpanel
        JPanel jPanel = new JPanel();

        // Set layout cho Jpanel, sử dụng BorderLayout()
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_down, BorderLayout.EAST);
        jPanel.add(jButton_reset, BorderLayout.SOUTH);

        // Đưa tất cà thành phần: nút, khung Text vào 1 layout
        // Set BorderLayout()
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);

    }

    // Xay dựng phương thức tăng
    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

    // Xây dựng phương thức giảm
    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

    // Xây dựng phương thức reset-\
    public void reset(){
        this.counterModel.reset();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

}
