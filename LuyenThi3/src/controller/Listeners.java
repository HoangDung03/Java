package controller;

import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners implements ActionListener {
    private View view;

    public Listeners(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Ket qua")){
            this.view.tinhToan();
        }else if (src.equals("Luu ket qua")){
            this.view.luuKetQua();
        }
    }
}
