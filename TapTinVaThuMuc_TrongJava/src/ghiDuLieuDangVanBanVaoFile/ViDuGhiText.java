package ghiDuLieuDangVanBanVaoFile;

import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("E:\\Intellij\\TapTinVaThuMuc_TrongJava\\src\\ghiDuLieuDangVanBanVaoFile\\text4.txt", "UTF-8" );
            pw.println("Xin chào ");
            pw.print("Du lieu: ");
            pw.print(3.14);
            pw.print(' ');
            pw.print(" la so pi");

            Student st = new Student(100, " Hoang");

            pw.println();
            pw.println(st);
            pw.println();
            pw.flush();
            pw.close();

        }catch (Exception e){
            e.printStackTrace();
        }







    }
}
