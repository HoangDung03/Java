package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDu_PiorityQueue {
    public static void main(String[] args) {
        /* PriorityQueue se sap xep moi gia tri được đưa vao
        hàng đơi, khong quan tâm giá trị nào vào trước hay sau*/
        Queue<String> danhSachSV = new PriorityQueue<String>();
        danhSachSV.offer("Hoang 1");
        danhSachSV.offer("Nguyen Van b");
        danhSachSV.offer("Nguyen Van a");
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
