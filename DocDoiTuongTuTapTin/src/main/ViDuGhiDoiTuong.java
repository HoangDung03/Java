package main;

import java.io.*;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Intellij\\GhiDoiTuongVaoFile\\file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sv = new SinhVien("001", "Nguyen Van A", 2003, 10);
            oos.writeObject(sv);

            oos.flush();
            oos.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
