package view;

import controller.MenuListen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

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

        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_new.addActionListener(menuListen);

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_open.addActionListener(menuListen);

        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_exit.addActionListener(menuListen);

        jMenuFile.addSeparator();
        jMenuFile.add(jMenuItem_new);
        jMenuFile.add(jMenuItem_open);
        jMenuFile.add(jMenuItem_exit);

        JMenu jMenuHelp = new JMenu("Help");
        jMenuHelp.setMnemonic(KeyEvent.VK_L);
        jMenuHelp.setDisplayedMnemonicIndex(0);
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
