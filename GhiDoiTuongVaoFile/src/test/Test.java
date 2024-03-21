package test;

import main.DanhSachSinhVien;
import main.SinhVien;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("MENU -----------");
            System.out.println("Vui long chon chuc nang!");
            System.out.println(
                    "1. Them sinh vien vao danh sach\n"
                            + "2. In danh sach sinh vien ra man hinh\n"
                            + "3. Kiem tra danh sach co rong hay khong?\n"
                            + "4. Lay ra so luong sinh vien trong danh sach\n"
                            + "5. Lam rong danh sach sinh vien\n"
                            + "6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien\n"
                            + "7. Xoa mot sinh vien ra khoi danh sach dua theo ma sinh vien\n"
                            + "8. Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim\n"
                            + "9. Xuat ra danh sach sinh vien co diem tu cao den thap\n"
                            + "10. Luu danh sach sinh vien xuong tap tin\n"
                            + "0. Thoat khoi chuong trinh!"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon==1){
                // Them sinh vien vao danh sach
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
                System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt();
                System.out.println("Nhap diem trung binh: "); float diemTrungBinh = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen,namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);

            }else if (luaChon ==2){
                // In danh sach sinh vien
                dssv.inDanhSachSinhVien();


            }else if (luaChon ==3){
                // Kiem tra danh sach sinh vien co rong khong?
                System.out.println("Danh sach rong: " + dssv.kiemtraDanhSachRong());

            }else if (luaChon ==4){
                // Lay ra so luong sinh vien trong danh sach
                System.out.println("So luong sinh vien hien tai: " + dssv.laySoLuongSinhVien());

            }else if (luaChon ==5){
                // Lam rong danh sach
                dssv.lamrongDanhSach();

            }else if (luaChon ==6){
                //Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien\n"
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiem tra sinh vien co trong danh sach: " + dssv.kiemTraTonTai(sv));

            }else if (luaChon ==7){
                //Xoa mot sinh vien ra khoi danh sach dua theo ma sinh vien"
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach: " + dssv.xoaSinhVien(sv));


            }else if (luaChon ==8){
                //Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim\n"
                System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dssv.timSinhVien(hoVaTen);

            }else if (luaChon ==9){
                //Xuat ra danh sach sinh vien co diem tu cao den thap\n"
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();

            } else if (luaChon == 10) {
                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine();
                File f = new File(tenFile);
                dssv.ghiDuLieuXuongFile(f);
            }

        }while (luaChon!=0);
    }
}
