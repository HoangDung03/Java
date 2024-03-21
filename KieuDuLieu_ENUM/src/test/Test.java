package test;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Toan Ly Hoa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Van Su Dia");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday, "Ly Hoa Sinh");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thusday, "Tin - GDCD - The duc");
        ThoiKhoaBieu tkb_t6 = new ThoiKhoaBieu(Day.Tuesday, "Van Su Dia");

        System.out.println(tkb_t2);
        System.out.println(tkb_t3);
        System.out.println(tkb_t4);
        System.out.println(tkb_t5);
        System.out.println(tkb_t6);

        int x = Thang.Thang_1.soNgay();
        System.out.println(x);








    }
}
