package controller;

import view.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {

    private MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("RED TEXT")){
            this.myColorView.changeColor(Color.RED);
        }else  if (src.equals("GREEN TEXT")){
            this.myColorView.changeColor(Color.GREEN);
        }else  if (src.equals("BLUE TEXT")){
            this.myColorView.changeColor(Color.BLUE);
        }else  if (src.equals("RED BACKGROUND")){
            this.myColorView.changeBackgroundColor(Color.RED);
        }else  if (src.equals("GREEN BACKGROUND")){
            this.myColorView.changeBackgroundColor(Color.GREEN);
        }else  if (src.equals("BLUE BACKGROUND")){
            this.myColorView.changeBackgroundColor(Color.BLUE);
        }else if (src.equals("RESET")){
            this.myColorView.resetColor();
        }
    }
}
