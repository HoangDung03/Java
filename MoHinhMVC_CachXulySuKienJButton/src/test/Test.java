package test;

import model.CounterModel;
import view.CounterView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        // tạo một biến CounterModel
        CounterModel ct = new CounterModel();
        ct.increment();
        ct.increment();
        ct.increment();
        System.out.println(ct.getValue());
        ct.decrement();
        System.out.println(ct.getValue());

        // Sử dụng giao diện riêng của hệ điều hành
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            CounterView ctv = new CounterView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
