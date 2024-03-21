package ViDu;

import java.util.Arrays;

public class Test_2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(150, "Nguyen Van Lan", "Lop1", 9);
        SinhVien sv2 = new SinhVien(100, "Nguyen Van Bong", "Lop2", 8);
        SinhVien sv3 = new SinhVien(199, "Nguyen Van Na", "Lop2", 7);

        SinhVien[] a_sv = new SinhVien[]{sv1, sv2, sv3};

        System.out.println("ban dau: " + Arrays.toString(a_sv));

        // ham sap xep
        Arrays.sort(a_sv);
        System.out.println("Sau khi sap xep: " + Arrays.toString(a_sv));

        // Tim Kiem
        System.out.println("tim kiem Lan: " + Arrays.binarySearch(a_sv, sv1));





    }
}
