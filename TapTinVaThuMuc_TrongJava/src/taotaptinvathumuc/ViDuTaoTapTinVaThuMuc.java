package taotaptinvathumuc;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        // Luu y:
        // Ms Window: \ => \\ viDu: C:\\ThuMuc1\\ThuMuc2\\TapTin.java
        // Linux, MacOs: / |=> viDu: /ThuMuc1/ThuMuc2/TapTin.java
        //Kiem tra thu muc hoac tap tin co ton tai hay khong?
        File folder1 = new File("E:\\Intellij\\TaoTapTinVaThuMuc_TrongJava\\src\\main\\data.txt");
        File folder2 = new File("E:\\Intellij\\TaoTapTinVThuMuc_TrongJava\\src\\main\\data.txt");


        System.out.println("Kiem tra folder1 co ton tai: " + folder1.exists());
        System.out.println("Kiem tra folder2 co ton tai: " + folder2.exists());

        // Tao thu muc:
        // phuong thuc mkdir() => tao 1 thu muc
        File d1 = new File("E:\\Intellij\\TaoTapTinVaThuMuc_TrongJava\\Directory_1");
        d1.mkdir();

        // phuong thuc mkdirs() => tao nhieu thu muc cung luc
        File d2 = new File("E:\\Intellij\\TaoTapTinVaThuMuc_TrongJava\\Directory_1\\Directory_2\\Directory3");
        d2.mkdirs();

        // tao tap tin (co phan mo rong)
        File file1 = new File("E:\\Intellij\\TaoTapTinVaThuMuc_TrongJava\\Directory_1\\viDu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            // Khong co quyen tao tap tin
            // O cung bi day
            // Duong dan sai
            e.printStackTrace();
        }


    }
}
