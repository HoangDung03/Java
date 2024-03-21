package test;

import view.LastButtonView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LastButtonView();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
