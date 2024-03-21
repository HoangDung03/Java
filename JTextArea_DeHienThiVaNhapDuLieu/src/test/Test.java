package test;

import view.TimKiemView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new TimKiemView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
