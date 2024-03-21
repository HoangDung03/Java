package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // 1 them sinh vien vao danh sach
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }

    // 2 In danh sach sinh vien
    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    // 3 Kiem tra danh sach sinh vien co rong hay khong?
    public boolean kiemtraDanhSachRong(){
        return this.danhSach.isEmpty();
    }

    //4. Lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }

    //5. Lam rong danh sach sinh vien
    public void lamrongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }

    //6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien"
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }

    //7. Xoa mot sinh vien ra khoi danh sach dua theo ma sinh vien\n"
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }

    //8. Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim\n"
    public boolean timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        } return false;

    }

    //9. Xuat ra danh sach sinh vien co diem tu cao den thap\n"
    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()){
                    return 11;
                }else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

    // 10. Ghi xuong file
    public void ghiDuLieuXuongFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (SinhVien sinhVien : danhSach) {
                oos.writeObject(sinhVien);
            }

            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Doc du lieu tu file
    public void docDuLieuTuFile(File f) {
        try {
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sv = null;
            while (true){
                Object oj =  ois.readObject();
                if (oj == null) {
                    break;
                }
                if (oj != null) {
                    sv = (SinhVien) oj;
                    this.danhSach.add(sv);
                }
            }
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
