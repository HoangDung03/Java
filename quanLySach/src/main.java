public class main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,5,2021);
        Ngay ngay2 = new Ngay(23, 4, 2003);
        Ngay ngay3 = new Ngay(16, 9 ,1979);

        TacGia tacGia1 = new TacGia("Hoang", ngay1);
        TacGia tacGia2 = new TacGia("Tien", ngay2);

        Sach sach1 = new Sach("Java", 5000, 2023, tacGia1);
        Sach sach2 = new Sach("C++", 12000, 2020, tacGia2);

        System.out.println(sach1);

        System.out.println("So sanh: sach1 va sach2: " + sach1.ktraCungNamXuatBan(sach2));

        System.out.println("Gia sach 1 sau khi giam 10%: " + sach1.giaSauKhiGiam(10));
    }
}
