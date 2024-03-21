import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dlst1 = sc.nextInt();
        int dlst2 = sc.nextInt();

        subThread st1 = new subThread(dlst1);
        subThread st2 = new subThread(dlst2);

        st1.start();
        st2.start();
//        st2.setPriority(10);
//        st1.setPriority(1);
//
//        System.out.println("Main thread stop");
    }
}
class subThread extends Thread{
    private int delay;

    public subThread(int delay) {
        this.delay = delay;
    }
    public void run(){
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+ " , " + i);
            try {
                Thread.sleep(delay * 1);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
