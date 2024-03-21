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
        this.setSize(630, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 30);

        jLabel_vanBan = new JLabel("Văn Bản");
        jLabel_vanBan.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);

        /*  Để sử dung thanh cuộn JScrollPane trên giao diện có nhiều cách
         */

        /* 1. Khai báo JScrollPane sau đó đưa đối tượng cần dùng thanh cuộn
        Ở đây đối tượng cần dùng đó là jTextArea_vanBan*/
        //        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan);

        /* 2. Sau khi khai báo JScrollPane không cần đưa jTextArea_vanBan vào
        mà dùng hàm setViewportView(jTextArea_vanBan);
        */
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTextArea_vanBan);

        /* 3. Khai báo JScrollPane sau đó đưa đối tượng cần dùng thanh cuộn
        Sử dụng các hàm JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
        hoặc JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        */
//        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        /* 4. Nếu muốn chi hiển thị thanh cuộn ngang hoặc thanh cuộn dọc thì cái
        nào ko muốn hiện thì . đằng sau dùng hàm VERTICAL_SCROLLBAR_NEVER hoặc
        HORIZONTAL_SCROLLBAR_NEVER
        * */
//        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


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
        jPanel_footer.setLayout(new GridLayout(2, 2, 10, 10));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);


        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void timKiem() {
        this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
    }
}
