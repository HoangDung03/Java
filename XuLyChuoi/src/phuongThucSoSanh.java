
//PHUONG THUC SO SANH LOP STRING()
public class phuongThucSoSanh {
    public static void main(String[] args) {
        String s1 = "hoangdung";
        String s2 = "HoangDung";
        String s3 = "hoangdung";

        // Ham equal() => so sanh 2 chuoi giong nhau (co phan biet viet hoa va thuong)
        System.out.println("S1 equals S2: " + s1.equals(s2));
        System.out.println("S1 equals S3: " + s1.equals(s3));
        System.out.println("------------------------------");

        // Ham equalsIgnoreCase() => so sanh 2 chuoi giong nhau khong phan biet viet hoa va thuong
        System.out.println("S1 equals S2: " + s1.equalsIgnoreCase(s2));
        System.out.println("S1 equals S3: " + s1.equalsIgnoreCase(s3));
        System.out.println("------------------------------");

        // Ham compareTo() => so sanh > < =
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van A";
        System.out.println("Sv1 compareTo Sv2: " + sv1.compareTo(sv2));
        System.out.println("Sv1 compareTo Sv3: " + sv1.compareTo(sv3));
        System.out.println("Sv1 compareTo Sv4: " + sv1.compareTo(sv4));
        System.out.println("------------------------------");

        // Ham compareToIgnoreCase() => tuong tu ham compareTo() nhung khong phan biet chu hoa va thuong
        String svi1 = "Nguyen Van A";
        String svi2 = "nguyen van B";
        String svi3 = "nguyen van";
        String svi4 = "Nguyen Van A";
        System.out.println("Svi1 compareToIgnoreCase Svi2: " + sv1.compareToIgnoreCase(sv2));
        System.out.println("Svi1 compareToIgnoreCase Svi3: " + sv1.compareToIgnoreCase(sv3));
        System.out.println("Svi1 compareToIgnoreCase Svi4: " + sv1.compareToIgnoreCase(sv4));
        System.out.println("------------------------------");

        // Ham regionMatches => So sanh mot doan
        String r1 = "HoangDung";
        String r2 = "Dung";
        boolean check = r1.regionMatches(5,r2,0,4);
        System.out.println(check);
        System.out.println("------------------------------");

        // Ham startWith() => Ham kiem tra chuoi bat dau bang....
        String sdt1 = "037456789";
        System.out.println(sdt1.startsWith("037"));
        System.out.println(sdt1.startsWith("034"));
        System.out.println("------------------------------");

        // Ham endWith() => Ham kiem tra chuoi ket thuc bang....
        String tenFile1 = "HoangDung.jpg";
        String tenFile2 = "HoangDung.java";
        if(tenFile1.endsWith(".jpg")){
            System.out.println("File 1 la hinh anh");
        }if (tenFile2.endsWith(".java")) {
            System.out.println("File 2 la file java");
        }


    }
}