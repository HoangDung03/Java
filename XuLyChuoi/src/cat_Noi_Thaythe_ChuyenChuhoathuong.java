import java.util.Locale;

public class cat_Noi_Thaythe_ChuyenChuhoathuong {
    public static void main(String[] args) {
        String s1 = "Hoang";
        String s2 = "Dung";
        String s3 = s1+s2;

        // Ham concat() => noi hai chuoi vs nhau
        String s4 = s1.concat(s2);
        System.out.println("S3 = " + s3);
        System.out.println("S4 = " + s4);

        // Ham replaceAll() => thay the
        String s5 = "Hoang.com";
        String s6 = s5.replaceAll("Hoang", "Dung");
        System.out.println("S6 = " + s6);

        // Ham toLowerCase() => chuyen chuoi vef viet thuong
        // Ham toUpperCase() => chuyen chuoi ve viet hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("S7 = " + s7);
        System.out.println("S8 = " + s8);

        // Ham trim() => xoa bo khoang trang giua hai dau chuoi
        String s9 = " Hoang Dung xin chao cac ban ";
        System.out.println("S9 = " + s9.trim());

        // Ham toCharArray()
        // Ham subString() => Cat chuoi con tu chuoi ban dau
        String s10 = "Hoang Dung xin chao cac ban";
        String s11 = s10.substring(10);
        String s12 = s10.substring(10, 16);
        System.out.println("S11 = " + s11);
        System.out.println("S12 = " + s12);


    }
}
