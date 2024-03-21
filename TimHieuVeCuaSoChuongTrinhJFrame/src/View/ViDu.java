package View;

import javax.swing.*;

public class ViDu {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Vi Du JFrame");
        jf.setSize(600, 400);

//
//        while (true){
//            System.out.println("Chuong trinh dang chay");
//        }

        // Gan vi tri hien thi
        jf.setLocation(300, 300);


        // Thoat khoi chuong trinh khi dong cua so JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // cho phep hien thi
        jf.setVisible(true);
    }
}
