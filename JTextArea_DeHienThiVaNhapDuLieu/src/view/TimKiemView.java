package view;

import controller.TimKiemListener;
import model.TimKiemModel;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JLabel jLabel_vanBan;
    private JTextArea jTextArea_vanBan;
    private JLabel jLabel_tuKhoa;
    private JTextField jTextField_tuKhoa;
    private JLabel jLabel_ketQua;

    public TimKiemView() throws HeadlessException {
        this.timKiemModel = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setTitle("Tìm kiếm");
        this.setSize(630,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 30);

        jLabel_vanBan = new JLabel("Văn Bản");
        jLabel_vanBan.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100,100);
//        jTextArea_vanBan.setAlignmentX(SwingConstants.CENTER);
        jTextArea_vanBan.setFont(font);



        TimKiemListener timKiemListener = new TimKiemListener(this);

        jLabel_tuKhoa = new JLabel("Từ khóa");
        jLabel_tuKhoa.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField_tuKhoa.setFont(font);

        JButton jButton_thongKe = new JButton("Thống kê");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiemListener);
        jButton_thongKe.setBackground(Color.BLACK);
        jButton_thongKe.setForeground(Color.WHITE);
        jButton_thongKe.setBorderPainted(false);
        jButton_thongKe.setOpaque(true);


        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_ketQua.setForeground(Color.BLACK);
        jLabel_ketQua.setBackground(Color.WHITE);
        jLabel_ketQua.setOpaque(true);
        jLabel_ketQua.setFont(font);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2,2,10,10));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);


        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jTextArea_vanBan, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void timKiem(){
        this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
    }
}
