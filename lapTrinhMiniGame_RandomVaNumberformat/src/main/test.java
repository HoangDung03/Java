package main;

import java.util.Random;
import java.util.Scanner;

/* Mot nguoi choi co tai khoan.Nguoi choi co quyen dat so tien nhieu hon
hoac it hon so tien ho dang co.
* Luat choi nhu sau:
- Co 3 vien xuc xac. Moi vien xuc xac co 6 mat co gtri tu 1-6.
- Moi lan lac se ra mot ket qua. Ket qua = gtri xx1 + gtri xx2 + gtri xx3;
- 1. Neu tong = 3 hoac 18 => Nha cai an het
- 2. Neu tong = (4-10) <-> xiu => Neu nguoi choi dat xiu thi thang, nguoc lai thi thua
- 3. Neu tong = (1-17) <-> tai => Neu nguoi choi dat xiu thi nguoi choi thang, nguoc lai thua

*/
public class test {
    public static void main(String[] args) {
        int taiKhoanNguoiChoi = 5000000;
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("__Vui long chon__");
            System.out.println("Chon (1) de bat dau choi!");
            System.out.println("Chon phim bat ky de thoat!");
            chon = sc.nextInt();
            if (chon == 1) {
                System.out.println("__Tro choi bat dau__");
                System.out.println("Tai khoan cua ban hien tai: " + taiKhoanNguoiChoi);
                System.out.println("Ban muon dat cuoc bao nhieu?");
                double tienCuoc = 0;
                do {
                    System.out.println("Dat cuoc (0<tienCuoc<=5000000)" + taiKhoanNguoiChoi + ": ");
                    tienCuoc = sc.nextDouble();
                } while (tienCuoc <= 0 || tienCuoc > taiKhoanNguoiChoi);

                int chonTaiXiu;
                do {
                    System.out.println("Chon (1) <-> Tai hoac (2) <-> Xiu");
                    chonTaiXiu = sc.nextInt();
                } while (chonTaiXiu != 1 && chonTaiXiu != 2);

                Random xx1 = new Random();
                Random xx2 = new Random();
                Random xx3 = new Random();

                int gTri1 = xx1.nextInt(5) + 1;
                int gTri2 = xx2.nextInt(5) + 1;
                int gTri3 = xx3.nextInt(5) + 1;
                int sum = gTri1 + gTri2 + gTri3;

                System.out.println("Ket qua: " + gTri1 + " - " + gTri2 + " - " + gTri3);
                if (sum == 1 || sum == 18) {
                    System.out.println("Tong la: " + sum + "Nha cai an het, ban da thua cuoc!");
                    System.out.println("So tien con lai cua ban: " + taiKhoanNguoiChoi);
                }
                if (sum >= 4 || sum <= 10) {
                    taiKhoanNguoiChoi += tienCuoc;
                    System.out.println("Tong la: " + sum + "=> Xiu!");

                    if (chonTaiXiu == 2) {
                        System.out.println("------- Ban da thang cuoc!");
                        taiKhoanNguoiChoi += tienCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + taiKhoanNguoiChoi);

                    } else {
                        System.out.println("------- Ban da thua cuoc!");
                        taiKhoanNguoiChoi -= tienCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + taiKhoanNguoiChoi);
                    }

                } else {
                    System.out.println("------- Tong la: " + sum + " => Tai");
                    if (chonTaiXiu == 1) {
                        System.out.println("------- Ban da thang cuoc!");
                        taiKhoanNguoiChoi += tienCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + taiKhoanNguoiChoi);

                    } else {
                        System.out.println("------- Ban da thua cuoc!");
                        taiKhoanNguoiChoi -= tienCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + taiKhoanNguoiChoi);
                    }
                }


            }
        }while(chon == 1) ;


    }
}
