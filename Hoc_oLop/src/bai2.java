import java.awt.*;

public class bai2 {
    public static void main(String[] args) {
        jframe jframe = new jframe();
        commonN n;

        TestThread t1 = new TestThread("Luong 1", jframe);

        t1.start();

    }
}

class TestThread extends Thread {
    private String threadName;
    jframe j;

    TestThread(String name, jframe j) {
        threadName = name;
        this.j = j;
    }

    public void run() {

    }
}

class commonN {
    int x = 100;
    int y = 100;
    int point = 0;
}

class jframe extends Frame{

    jframe () {
        setVisible(true);
        setSize(400, 400);
    }
}
