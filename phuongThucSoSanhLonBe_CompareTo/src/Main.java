import ViDu.SinhVien;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(150, "Nguyen Van An", "Lop1", 9);
        SinhVien sv2 = new SinhVien(100, "Nguyen Van Bo", "Lop2", 8);
        SinhVien sv3 = new SinhVien(199, "Nguyen Van Ca", "Lop2", 7);
//        SinhVien sv4 = new SinhVien(180, "Nguyen Thi Thanh Hoa", "Lop2", 10);

        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv1.compareTo(sv3));












    }
}