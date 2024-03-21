package view;

import controller.MenuListen;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame {
    private JLabel jLabel;

    public MenuView() {
        this.setTitle("MENU");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 30);

        MenuListen menuListen = new MenuListen(this);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuFile = new JMenu("File");
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(menuListen);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(menuListen);
        jMenuFile.addSeparator();
        jMenuFile.add(jMenuItem_open);
        jMenuFile.add(jMenuItem_exit);

        JMenu jMenuHelp = new JMenu("Help");
        JMenuItem jMenuItem_welcom = new JMenuItem("Welcome");
        jMenuItem_welcom.addActionListener(menuListen);
        jMenuHelp.add(jMenuItem_welcom);

        jMenuBar.add(jMenuFile);
        jMenuBar.add(jMenuHelp);

        this.setJMenuBar(jMenuBar);

        jLabel = new JLabel();
        jLabel.setFont(font);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void setTextJLable(String s){
        this.jLabel.setText(s);
    }

}
