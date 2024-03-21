package test;

import model.CounterModel;
import view.CounterView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        CounterModel ct = new CounterModel();

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            CounterView ctv = new CounterView();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
