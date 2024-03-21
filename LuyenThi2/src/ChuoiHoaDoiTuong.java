import java.io.*;

public class ChuoiHoaDoiTuong  {
    public static void main(String[] args) {
        Student student1 = new Student("Hoang", 19);
        Student student2 = new Student("Dung",20);

        // ghi doi tuong vao file
        String fileName = "students.dat";

        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(student1); // Ghi đối tượng student1 vào file
            oos.writeObject(student2); // Ghi đối tượng student2 vào file

            System.out.println("Đã ghi đối tượng vào file " + fileName);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // doc doi tuong tu file
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            System.out.println("Đọc đối tượng từ file " + fileName + ":");
            System.out.println(student1);
            System.out.println(student2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
