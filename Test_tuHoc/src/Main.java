import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    Button btnTamGiac, btnTron, btnChuNhat;
    Graphics g;

    public Main() {
        setTitle("Hình học");
        setSize(550, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel_Button = new JPanel();
        JPanel jPanel_hinh = new JPanel();

        // Tao nut
        btnTamGiac = new Button("Triangle");
        btnTron = new Button("Circle");
        btnChuNhat = new Button("Rectangle");

        // Set vi tri
        btnTamGiac.setBounds(50, 50, 100, 30);
        btnTron.setBounds(200, 50, 100, 30);
        btnChuNhat.setBounds(350, 50, 100, 30);

        // Them cac nut vao giao dien
        add(btnTamGiac);
        add(btnTron);
        add(btnChuNhat);

        // Them su kien cho cac nut
        btnTamGiac.addActionListener(this);
        btnTron.addActionListener(this);
        btnChuNhat.addActionListener(this);
//
//        jPanel_Button.add(btnTamGiac);
//        jPanel_Button.add(btnTron);
//        jPanel_Button.add(btnChuNhat);
//        jPanel_Button.setLayout(new BorderLayout());
//        add(jPanel_Button, BorderLayout.NORTH);

//        jPanel_hinh.add();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Lay Doi Tuong nut da duoc nhan chon
        Button btn = (Button) e.getSource();

        if (btn == btnTamGiac) {
            // Hinh tam giac
            g = getGraphics();
            g.clearRect(0, 0, getWidth(), getHeight());
            g.drawLine(100, 100, 200, 200);
            g.drawLine(200, 200, 100, 300);
            g.drawLine(100, 100, 100, 300);
        } else if (btn == btnTron) {
            // Hinh tron
            g = getGraphics();
            g.clearRect(0, 0, getWidth(), getHeight());
            g.drawOval(100, 100, 200, 200);
        } else if (btn == btnChuNhat) {
            // Hinh chu nhat
            g = getGraphics();
            g.clearRect(0, 0, getWidth(), getHeight());
            g.drawRect(100, 100, 200, 200);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}