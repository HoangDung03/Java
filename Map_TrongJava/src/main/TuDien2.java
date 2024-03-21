package main;

import java.util.*;

// Tự học

public class TuDien2 {
    private Map<String, String> duLieu2 = new TreeMap<String, String>();

    public String themTu2(String tuKhoa2, String yNghia2){
        return this.duLieu2.put(tuKhoa2, yNghia2);
    }

    public String xoaTu2(String tuKhoa2){
        return this.duLieu2.remove(tuKhoa2);
    }

    public String traTu2(String tuKhoa2){
        String yNghia2 = this.duLieu2.get(tuKhoa2);
        return yNghia2;
    }

    public void inTuKhoa2(){
        Set<String> tapHopTuKhoa2 = this.duLieu2.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa2.toArray()));
    }

    public int laySoLuong2(){
        return this.duLieu2.size();
    }

    public void xoaTatCa2(){
        this.duLieu2.clear();
    }

    public static void main(String[] args) {
        TuDien2 td2 = new TuDien2();
        int luaChon2 = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("----------------------");
            System.out.println("MENU");
            System.out.println(
                    ". Tra tu dien Anh-Viet: \n" +
                            "1. Them tu(Tu khoa, Y nghia)\n"+
                            "2. Xoa tu\n"+
                            "3. Tim y nghia cua tu khoa => tra tu\n"+
                            "4. In ra danh sach tu khoa\n"+
                            "5. In ra so luong tu\n"+
                            "6. Xoa tat ca cac tu khoa\n"+
                            "0. Chon phim 0 de thoat");
            luaChon2 = sc.nextInt();
            sc.nextLine();
            if(luaChon2 == 1){
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa2 = sc.nextLine();
                System.out.println("Nhap vao y nghia: ");
                String yNghia2 = sc.nextLine();
                td2.themTu2(tuKhoa2, yNghia2);
            }else if(luaChon2==2 || luaChon2==3){
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa2 = sc.nextLine();
                if (luaChon2==2){
                    td2.xoaTu2(tuKhoa2);
                }else {
                    System.out.println("Y nghia la: " + td2.traTu2(tuKhoa2));
                }
            }else if(luaChon2==4){
                td2.inTuKhoa2();
            }else if(luaChon2==5){
                System.out.println("So luong tu khoa: " + td2.laySoLuong2());
            }else if (luaChon2==6){
                td2.xoaTatCa2();
            }

        }while (luaChon2 != 0);
    }
}
