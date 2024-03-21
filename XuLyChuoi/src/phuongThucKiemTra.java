import java.util.Scanner;

// PHUONG THUC KIEM TRA LOP STRING()
public class phuongThucKiemTra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("------------------");

        // Ham length()
        System.out.println(s.length());
        int doDai = s.length();

        // Ham charAt(vi tri) => lay ra 1 ky tu trong chuoi
        for (int i=0; i<s.length(); i++){
            System.out.println("Vi tri " + i + " la: " + s.charAt(i));
        }
        System.out.println("------------------");

        // Ham getChars()(Vi tri bat dau, vi tri ket thuc, mang luu du lieu, vi tri bat dau luu cua mang)
        char[] arrChar = new char[100];
        s.getChars(2,5,arrChar, 0);
        for(int i=0; i<arrChar.length; i++){
            System.out.println("gia tri cua mang tai " + i + "la: " + arrChar[i]);
        }
        System.out.println("------------------");

        // ham getByte() => co 3 cach, lay ra gia tri cua cac ky tu thanh 1 mang
        byte[] arrByte = s.getBytes();
        for(byte b : arrByte){
            System.out.println(b);
        }
    }
}
