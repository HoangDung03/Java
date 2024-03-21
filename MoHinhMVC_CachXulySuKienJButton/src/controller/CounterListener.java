package controller;

import view.CounterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Sử dụng lớp ActionListener để thực thi hành động
public class CounterListener implements ActionListener {
    private CounterView ctv;

    // hàm constructor()
    public CounterListener(CounterView ctv){
        this.ctv = ctv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        // tạo biến src với phương thức getActonCommand để xác định hành động của User
        String src = e.getActionCommand();

        if (src.equals("UP  ")){
            this.ctv.increment();
        }else if (src.equals("DOWN")){
            this.ctv.decrement();
        } else if (src.equals("RESET")) {
            this.ctv.reset();
        }

    }

}
