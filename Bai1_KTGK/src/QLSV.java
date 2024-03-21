
import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (i+1));
            System.out.print("Ho va ten: ");
            String name = sc.nextLine();
            System.out.print("Tuoi: ");
            int age = sc.nextInt();
            System.out.print("Id: ");
            String id = sc.next();
            students[i] = new Student(name, age, id);
            sc.nextLine();
        }
        while (true) {
            System.out.print(
                    "1. Nhap n de tim theo ten \n" +
                            "2. Nhap t de tim theo tuoi \n" +
                            "3. Nhap i de tim theo id \n" +
                            "4. Nhập p để xem toàn bộ danh sách \n" +
                            "5. Nhập e để thoát khỏi chương trình \n"
            );
            String c = sc.next();
            switch (c) {
                case "n":
                    System.out.print("Ten: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    searchByName(students, n, name);
                    break;
                case "t":
                    System.out.print("Tuoi: ");
                    int age = sc.nextInt();
                    searchByAge(students, n, age);
                    break;
                case "i":
                    System.out.print("Id: ");
                    String id = sc.next();
                    searchById(students, n, id);
                    break;
                case "p":
                    print(students, n);
                    break;
                case "e":
                    return;
            }
        }
    }

    public static void print(Student[] s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].toString());
        }
    }

    public static void searchByName(Student[] s, int n, String name) {
        for (int i = 0; i < n; i++) {
            s[i].searchName(name);
        }
    }

    public static void searchByAge(Student[] s, int n, int age) {
        for (int i = 0; i < n; i++) {
            s[i].searchAge(age);
        }
    }

    public static void searchById(Student[] s, int n, String id) {
        for (int i = 0; i < n; i++) {
            s[i].searchId(id);
        }
    }

}
