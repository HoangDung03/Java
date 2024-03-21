package ViDu;

import java.util.Arrays;

public class Test {
    public static int[] reverse (int[] x){
        int[] rs = new int[x.length];
        int index = 0;
        for (int i=x.length-1; i>=0; i--){
            rs[index] = x[i];
            index++;
        }
        return rs;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,8,2,6,4,3,7,9};
        int[] b = new int[15];

        System.out.println("a ban dau: " + Arrays.toString(a));
        // ham sapXep tang dan sort();
        Arrays.sort(a);
        System.out.println("a sau khi sap xep: " + Arrays.toString(a));

        // ham timKiem binarySearch();
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));

        System.out.println("---------------");
        // ham dien gia tri fill();
        Arrays.fill(b,5);
        System.out.println("b sau khi dien gia tri: " + Arrays.toString(b));

        // ham sapXep giam dan reverse();
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("a sau khi sap xep giam dan: " + Arrays.toString(a));







    }
}
