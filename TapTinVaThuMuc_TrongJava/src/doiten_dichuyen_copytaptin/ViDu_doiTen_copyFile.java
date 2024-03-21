package doiten_dichuyen_copytaptin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDu_doiTen_copyFile {
    public static void copyAll(File f1, File f2){
        try {
            // Copy ban than no
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
        if (f1.isDirectory()){
            // Copy cac tap tn va thu muc con
            File[] mangCon = f1.listFiles();
            for (File file : mangCon) {
                File file_new = new File(f2.getAbsoluteFile() + "/" + file.getName());
                copyAll(file, file_new);
            }
        }
    }


    public static void main(String[] args) {
//        File f0 = new File("E:\\Intellij\\TapTinVaThuMuc_TrongJava\\src\\File_1.txt");
        File f1 = new File("E:\\Intellij\\TapTinVaThuMuc_TrongJava\\src\\File_2.txt");
        File f2 = new File("E:\\Intellij\\TapTinVaThuMuc_TrongJava\\src\\File_2abc.txt");

        // 1. Thay doi ten tap tin hoac thu muc
        // Su dung File de thay doi ten
//        f0.renameTo(f1);

        // Su dung Files de thay doi ten
//        try {
//            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        // 2. Di chuyen File
//        File f_2new= new File("E:\\Intellij\\TapTinVaThuMuc_TrongJava\\F00\\File_2abc.txt");
//        try {
//            Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING );
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        // 3. Copy file
       File f_00 = new File("E:\\Intellij\\TapTinVaThuMuc_TrongJava\\F00") ;
       File f_00_copy = new File("E:\\Intellij\\TapTinVaThuMuc_TrongJava\\F00_copy");

//       try {
//           Files.copy(f_00.toPath(), f_00_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//
//       }catch (IOException e){
//           e.printStackTrace();
//       }

       ViDu_doiTen_copyFile.copyAll(f_00, f_00_copy);
    }
}
