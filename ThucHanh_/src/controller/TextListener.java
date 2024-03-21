package controller;

import view.TextView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextListener implements ActionListener {

    private TextView textView;

    public TextListener(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("red")){
            this.textView.changeColor(Color.RED);
        }else if (src.equals("black")){
            this.textView.changeColor(Color.BLACK);
        }if (src.equals("yellow")){
            this.textView.changeColor(Color.YELLOW);
        }if (src.equals("orange")){
            this.textView.changeColor(Color.ORANGE);
        }if (src.equals("green")){
            this.textView.changeColor(Color.green);
        }
    }



}
