package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        danhSachSV.offer("Hoang 1");
        danhSachSV.offer("Nguyen Van a");
        danhSachSV.offer("Nguyen Van b");
        danhSachSV.offer("Hoang 2");

        while (true){
            String ten = danhSachSV.poll(); //=> Lay ra va xoa
            if (ten==null){
                break;
            }
            // peek() => lay ra nhung ko xoa
            System.out.println(ten);


        }


    }
}
