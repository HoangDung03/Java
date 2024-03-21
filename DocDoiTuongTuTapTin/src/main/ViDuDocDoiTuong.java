package main;

import java.io.*;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Intellij\\GhiDoiTuongVaoFile\\file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);


            SinhVien sv = (SinhVien) ois.readObject();
            System.out.println(sv.getDiemTrungBinh());
            ois.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
