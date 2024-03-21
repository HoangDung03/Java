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
        if(src.equals("Red")){
            this.textView.changeColor(Color.RED);
        }else if(src.equals("Black")){
            this.textView.changeColor(Color.BLACK);
        }else if(src.equals("Yellow")){
            this.textView.changeColor(Color.yellow);
        }else if(src.equals("Orange")){
            this.textView.changeColor(Color.orange);
        }else if(src.equals("Green")){
            this.textView.changeColor(Color.GREEN);
        }else if(src.equals("=>")){
            this.textView.moveLaberRight();
        }else if(src.equals("<=")){
            this.textView.moveLaberLeft();
        }

    }
}
