package main;

import view.MenuView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MenuView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
