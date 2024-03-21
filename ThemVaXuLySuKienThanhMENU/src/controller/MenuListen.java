package controller;

import view.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListen implements ActionListener {

    private MenuView menuView;

    public MenuListen(MenuView menuView) {
        this.menuView = menuView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("Open")){
            this.menuView.setTextJLable("Ban da chon OPEN");
        }else if (src.equals("Exit")){
            System.exit(0);
        }else if (src.equals("Welcome")){
            this.menuView.setTextJLable("Ban da chon WELCOME");
        }
    }
}
