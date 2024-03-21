package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDu_Deque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();
        danhSachSV.offer("Hoang 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("Hoang 2");
        danhSachSV.offerLast("Hoang 4");
        danhSachSV.offerFirst("Hoang 3");

        while (true){
            String ten = danhSachSV.poll();
            if (ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
