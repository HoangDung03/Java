import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Kieu nguyen thuy
        int[] mang1 = {1,2,3};

        // Copy mang cach1
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        System.out.println("mang 1: "+ Arrays.toString(mang1));
        System.out.println("mang 1_a: "+ Arrays.toString(mang1_a));

        // Copy mang cach 2 - dung ham clone()
        int[] mang1_b = mang1.clone();
        mang1_a[0] = 50;
        System.out.println("mang 1_b "+ Arrays.toString(mang1_a));

        // Copy mang cach 3  - dung ham System.arraycopy()
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c,0,mang1.length);
        mang1_c[0] = 90;
        System.out.println("mang 1_c "+ Arrays.toString(mang1_c));

        // Kieu nguyen thuy String[]
        String[] mangDoiTuong = {"Hoang", "Dung"};

        // copy mang String[] - cach 1
        String[] mangDoiTuong_1a = mangDoiTuong;
        mangDoiTuong_1a[0] = "h";
        System.out.println("mangDoiTuong: "+ Arrays.toString(mangDoiTuong));
        System.out.println("mangDoiTuong1_a: "+ Arrays.toString(mangDoiTuong_1a));

        // Copy mang String[] cach 2 - dung ham clone()
        String[] mangDoiTuong_1b = mangDoiTuong.clone();
        mangDoiTuong_1a[0] = "H";
        System.out.println("mangDoiTuong_1b "+ Arrays.toString(mangDoiTuong_1a));

        // Copy mang String[] cach 3 - dung ham clone()
        String[] mangDoiTuong1_c = new String[mangDoiTuong.length];
        mangDoiTuong1_c[0] = "Hoang";
        System.out.println("mangDoiTuong1_c "+ Arrays.toString(mangDoiTuong_1a));





    }
}