package view;

import controller.MouseListeners;
import model.MouseModel;

import javax.swing.*;
import java.awt.*;

public class MouseView extends JFrame {
    private MouseModel model;
    private JPanel jPanel_Mouse;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count;
    private JLabel jLabel_count_value;
    private JLabel jLabel_empty1;
    private JLabel jLabel_checkIn;
    private JLabel jLabel_checkIn_Value;
    private JLabel jLabel_empty2;

    public MouseView() throws HeadlessException {
        this.model = new MouseModel();
        this.init();
    }


    private void init() {
        this.setTitle("MOUSE");
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 20);

        MouseListeners mouseListeners = new MouseListeners(this);

        jPanel_Mouse = new JPanel();
        jPanel_Mouse.setBackground(Color.cyan);
        jPanel_Mouse.addMouseListener(mouseListeners);
        jPanel_Mouse.addMouseMotionListener(mouseListeners);

        JPanel jPanel_Info = new JPanel();
        jPanel_Info.setLayout(new GridLayout(3,3));

        JLabel jLabel_Position = new JLabel("Position: ");
        jLabel_Position.setFont(font);
        jLabel_x = new JLabel("x = ");
        jLabel_x.setFont(font);
        jLabel_y = new JLabel("y = ");
        jLabel_y.setFont(font);
        jLabel_count = new JLabel("Number of click: ");
        jLabel_count.setFont(font);
        jLabel_count_value = new JLabel("n");
        jLabel_count_value.setFont(font);
        jLabel_empty1 = new JLabel();
        jLabel_empty1.setFont(font);
        jLabel_checkIn = new JLabel("Mouse is in component: ");
        jLabel_checkIn.setFont(font);
        jLabel_checkIn_Value = new JLabel("NO");
        jLabel_checkIn_Value.setFont(font);
        jLabel_empty2 = new JLabel();
        jLabel_empty2.setFont(font);


        jPanel_Info.add(jLabel_Position);
        jPanel_Info.add(jLabel_x);
        jPanel_Info.add(jLabel_y);
        jPanel_Info.add(jLabel_count);
        jPanel_Info.add(jLabel_count_value);
        jPanel_Info.add(jLabel_empty1);
        jPanel_Info.add(jLabel_checkIn);
        jPanel_Info.add(jLabel_checkIn_Value);
        jPanel_Info.add(jLabel_empty2);

        this.setLayout(new BorderLayout());
        this.add(jPanel_Mouse, BorderLayout.CENTER);
        this.add(jPanel_Info, BorderLayout.SOUTH);


        this.setVisible(true);
    }
    public void click(){
        this.model.addClick();
        this.jLabel_count_value.setText(this.model.getCount() + "");
    }

    public void entered(){
        this.model.entered();
        this.jLabel_checkIn_Value.setText(this.model.getCheckIn());
    }

    public void exit(){
        this.model.exit();
        this.jLabel_checkIn_Value.setText(this.model.getCheckIn());
    }

    public void update(int x, int y){
        this.model.setX(x);
        this.model.setY(y);
        this.jLabel_x.setText(this.model.getX()+"");
        this.jLabel_y.setText(this.model.getY()+"");

    }

}
