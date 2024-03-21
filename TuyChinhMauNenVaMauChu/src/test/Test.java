package test;

import view.MyColorView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyColorView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
