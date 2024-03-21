package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stackChuoi = new Stack<String>();
        // stackChuoi.push("Gia tri") => Dua gia tri vao stack
        // stachChuoi.pop() => Lay gia tri ra
        // stackChuoi.peek() => lay gia tri ra nhung khong xoa khoi stack
        // StackChuoi.clear() => Xoa tat ca phan tu trong stack
        // stackChuoi.contains("gia tri") => Xac dinh gia tri co ton tai trong stack hay khong?
        // stackChuoi.size() => do lon cua stack()



        // Vi du dao nguoc chuoi
        System.out.println("Nhap vao chuoi: ");
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc: ");
        for(int i=0; i<s.length(); i++){
            System.out.print(stackChuoi.pop());
        }

        // Vi du chuyen tu he thap phan sang nhi phan
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("\nNhap mot so nguyen duong: ");
        int x = sc.nextInt();
        while (x>0){
            int soDu = x%2;
            stackSoDu.push(soDu + "");
            x = x/2;

        }
        System.out.println("So nhi phan la: ");
        int n = stackSoDu.size();
        for (int i=0; i<n;i++){
            System.out.print(stackSoDu.pop() + " ");
        }

    }
}
