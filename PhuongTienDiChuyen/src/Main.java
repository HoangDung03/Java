public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Viettel ", "VietNam");
        HangSanXuat h2 = new HangSanXuat("Apple ", "America");
        HangSanXuat h3 = new HangSanXuat("Huawei ", "China");

        PhuongTienDiChuyen p1 = new XeOto(h1, "VinFast");
        MayBay p2 = new MayBay(h2, "Xang");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("Lay hang san xuat");
        System.out.println("p1: " + p1.layTenHangSanXuat());

        System.out.println("Bat dau: ");
        p2.batDau();
        System.out.println("Lay van toc: ");
        System.out.println("p1: " + p1.layVanToc() + " Km/h");
        System.out.println("p2: " + p2.layVanToc() + " Km/h");
        System.out.println("p3: " + p3.layVanToc() + " Km/h");

        System.out.println("Cat canh: ");
        p2.catCanh();
    }
}