package test;

import view.MiniCaculatorView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MiniCaculatorView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
