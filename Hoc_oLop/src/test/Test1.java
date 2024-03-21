package test;

import javax.swing.*;
import java.awt.*;

class NumberFrame extends JFrame {
    private JLabel numberLabel;

    public NumberFrame() {
        setTitle("NUMBER");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 30);

        numberLabel = new JLabel();
        numberLabel.setFont(font);
        numberLabel.setHorizontalAlignment(JLabel.CENTER);
        add(numberLabel);

        setVisible(true);
    }

    public synchronized void displayNumber(int number) {
        SwingUtilities.invokeLater(() -> {
            numberLabel.setText(String.valueOf(number));
            if (number % 2 == 0) {
                numberLabel.setForeground(Color.RED);
            } else {
                numberLabel.setForeground(Color.BLUE);
            }
        });
    }
}

class NumberDisplayThread1 extends Thread {
    private NumberFrame numberFrame;

    public NumberDisplayThread1(NumberFrame numberFrame) {
        this.numberFrame = numberFrame;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i+=2) {
            synchronized (numberFrame) {
                numberFrame.displayNumber(i);
                try {
                    numberFrame.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class NumberDisplayThread2 extends Thread {
    private NumberFrame numberFrame;

    public NumberDisplayThread2(NumberFrame numberFrame) {
        this.numberFrame = numberFrame;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i+=1) {
            synchronized (numberFrame) {
                numberFrame.displayNumber(i);
                numberFrame.notify();
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        NumberFrame numberFrame = new NumberFrame();

        NumberDisplayThread1 displayThread1 = new NumberDisplayThread1(numberFrame);
        displayThread1.start();
        NumberDisplayThread2 displayThread2 = new NumberDisplayThread2(numberFrame);
        displayThread2.start();
    }
}