package main;

import java.text.NumberFormat;
import java.util.Locale;
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
public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000.99;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("en", "US");
        //NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);


        int luaChon = 0;
        do{
            System.out.println("-------Moi ban lua chon-------");
            System.out.println("Chon (1) de tiep tuc choi.");
            System.out.println("Chon phim bat ky de thoat.");
            luaChon = sc.nextInt();
            if(luaChon==1){
                System.out.println("-------Bat dau choi-------");
                // Dat cuoc
                System.out.println("-------Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi) + ", ban muon cuoc bao nhieu?");
                double datCuoc = 0;
                do {
                    System.out.println("---Dat cuoc (0<so tien cuoc<="+ numf.format(taiKhoanNguoiChoi) + ": ");
                    datCuoc = sc.nextDouble();
                }while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                // Chon tai xiu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("-------Chon: 1 <-> Tai hoac 2 <-> Xiu");
                    luaChonTaiXiu = sc.nextInt();
                }while (luaChonTaiXiu !=1 && luaChonTaiXiu !=2);

                // Tung xuc xac
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri1 = xucXac1.nextInt(5)+1;
                int giaTri2 = xucXac2.nextInt(5)+1;
                int giaTri3 = xucXac3.nextInt(5)+1;
                int tong = giaTri1 + giaTri2 + giaTri3;


                // Tinh toan kq
                System.out.println("-------Ket qua: "+ giaTri1 + " - " + giaTri2 + " - " + giaTri3 );
                if(tong == 1 || tong == 18){
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("------- Tong la: " + tong + " => Nha cai an het, ban da thua!");
                    System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + numf.format(taiKhoanNguoiChoi));

                }if(tong >=4 && tong <=10){
                    System.out.println("------- Tong la: " + tong + " => Xiu");
                    if(luaChonTaiXiu==2){
                        System.out.println("------- Ban da thang cuoc!");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + numf.format(taiKhoanNguoiChoi));

                    }else {
                        System.out.println("------- Ban da thua cuoc!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + numf.format(taiKhoanNguoiChoi));
                    }

                }else {
                    System.out.println("------- Tong la: " + tong + " => Tai");
                    if(luaChonTaiXiu==1){
                        System.out.println("------- Ban da thang cuoc!");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + numf.format(taiKhoanNguoiChoi));

                    }else {
                        System.out.println("------- Ban da thua cuoc!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("------- Tai khoan cua ban sau khi cuoc la: " + numf.format(taiKhoanNguoiChoi));
                    }

                }

            }


        }while(luaChon==1);


    }
}
