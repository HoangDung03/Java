package view;

import controller.Listeners;
import model.Model;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class View extends JFrame {
    private Model model;
    private JTextField jTextField_tuSo;
    private JTextField jTextField_mauSo;
    private JTextField jTextField_ketQua;

    public View(){
        this.model = new Model();
        this.init();
    }

    private void init() {
        this.setTitle("Tinh toan!");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Listeners listeners = new Listeners(this);

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1,4,20,20));


        JLabel jLabel_tuSo = new JLabel("Tu so");
        JLabel jLabel_mauSo = new JLabel("Mau so");

        jTextField_tuSo = new JTextField();
        jTextField_mauSo = new JTextField();

        jPanel1.add(jLabel_tuSo);
        jPanel1.add(jTextField_tuSo);
        jPanel1.add(jLabel_mauSo);
        jPanel1.add(jTextField_mauSo);

        JPanel jPanel2 = new JPanel();
        Button button_save = new Button("Luu ket qua");
        button_save.addActionListener(listeners);
        jPanel2.add(button_save);

        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayout(1,2, 20,20));
        Button button_kq = new Button("Ket qua");
        button_kq.addActionListener(listeners);
        jTextField_ketQua = new JTextField();
        jPanel3.add(button_kq);
        jPanel3.add(jTextField_ketQua);


        this.setLayout(new BorderLayout());
        this.add(jPanel1, BorderLayout.NORTH);
        this.add(jPanel2, BorderLayout.CENTER);
        this.add(jPanel3,BorderLayout.SOUTH);
        this.setVisible(true);
    }

        //Tinh toan
        public void tinhToan(){
            double tuSo = Double.valueOf(jTextField_tuSo.getText());
            double mauSo = Double.valueOf(jTextField_mauSo.getText());
            this.model.setTuSo(tuSo);
            this.model.setMauSo(mauSo);
            this.model.tinhToan();
            this.jTextField_ketQua.setText(this.model.getKetQua()+"");
            try {
                if (mauSo == 0) {
                    this.jTextField_ketQua.setText("Mẫu số không thể là 0!");
                }
//            }catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            }
        }

        //Luu ket qua
        public void luuKetQua(){
            String fileName = "ketqua.txt";
            try (FileOutputStream fos = new FileOutputStream(fileName);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(jTextField_ketQua); // Ghi đối tượng vào file


                System.out.println("Đã ghi đối tượng vào file " + fileName);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
