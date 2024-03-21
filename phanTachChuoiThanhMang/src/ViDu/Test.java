package ViDu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Xin chao cac ban, toi la Dung!";

        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s2 = "Xin chao, toi la Hoang. Toi la dev";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        String s3 = "Nguyen Van A";
        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("ten: " + d[d.length-1]);



    }
}
