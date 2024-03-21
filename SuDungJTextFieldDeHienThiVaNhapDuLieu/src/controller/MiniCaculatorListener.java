package controller;

import view.MiniCaculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCaculatorListener implements ActionListener {
    private MiniCaculatorView miniCaculatorView;

    public MiniCaculatorListener(MiniCaculatorView miniCaculatorView) {
        this.miniCaculatorView = miniCaculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("+")){
           this.miniCaculatorView.plus();
        }else if (src.equals("-")){
            this.miniCaculatorView.minimus();
        }else if (src.equals("*")){
            this.miniCaculatorView.multiply();
        }else if (src.equals("/")){
            this.miniCaculatorView.devide();
        }else if (src.equals("^")){
            this.miniCaculatorView.pow();
        }else if (src.equals("%")){
            this.miniCaculatorView.mod();
        }
    }
}
