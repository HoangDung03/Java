package view;

import controller.MiniCaculatorListener;
import model.MiniCaculatorModel;

import javax.swing.*;
import java.awt.*;

public class MiniCaculatorView extends JFrame {
    MiniCaculatorModel miniCaculatorModel;
    private JTextField jTextField_fiValue;
    private JTextField jTextField_seValue;
    private JTextField jTextField_Answer;

    public MiniCaculatorView() throws HeadlessException {
        this.miniCaculatorModel = new  MiniCaculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Caculator");
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 30);
        JLabel jLabel_fiValue = new JLabel("A");
        jLabel_fiValue.setFont(font);
        JLabel jLabel_seValue = new JLabel("B");
        jLabel_seValue.setFont(font);
        JLabel jLabel_Answer = new JLabel("Answer");
        jLabel_Answer.setFont(font);

        jTextField_fiValue = new JTextField(50);
        jTextField_fiValue.setFont(font);
        jTextField_seValue = new JTextField(50);
        jTextField_seValue.setFont(font);
        jTextField_Answer = new JTextField(50);
        jTextField_Answer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3,2,5,5));
        jPanelIO.add(jLabel_fiValue);
        jPanelIO.add(jTextField_fiValue);
        jPanelIO.add(jLabel_seValue);
        jPanelIO.add(jTextField_seValue);
        jPanelIO.add(jLabel_Answer);
        jPanelIO.add(jTextField_Answer);

        MiniCaculatorListener miniCaculatorListener = new MiniCaculatorListener(this);
        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCaculatorListener);
        JButton jButton_minimus = new JButton("-");
        jButton_minimus.setFont(font);
        jButton_minimus.addActionListener(miniCaculatorListener);
        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(miniCaculatorListener);
        JButton jButton_devide = new JButton("/");
        jButton_devide.setFont(font);
        jButton_devide.addActionListener(miniCaculatorListener);
        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(miniCaculatorListener);
        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCaculatorListener);

        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new GridLayout(2,3));
        jPanelButton.add(jButton_plus);
        jPanelButton.add(jButton_minimus);
        jPanelButton.add(jButton_multiply);
        jPanelButton.add(jButton_devide);
        jPanelButton.add(jButton_pow);
        jPanelButton.add(jButton_mod);

        this.setLayout(new BorderLayout(10,10));
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jPanelButton, BorderLayout.SOUTH);

        this.setVisible(true);
    }


    public void plus(){
        double firstValue = Double.valueOf(jTextField_fiValue.getText());
        double secondValue = Double.valueOf(jTextField_seValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.plus();
        this.jTextField_Answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }
    public void minimus(){
        double firstValue = Double.valueOf(jTextField_fiValue.getText());
        double secondValue = Double.valueOf(jTextField_seValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.minimus();
        this.jTextField_Answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void multiply(){
        double firstValue = Double.valueOf(jTextField_fiValue.getText());
        double secondValue = Double.valueOf(jTextField_seValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.multiply();
        this.jTextField_Answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void devide(){
        double firstValue = Double.valueOf(jTextField_fiValue.getText());
        double secondValue = Double.valueOf(jTextField_seValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.devide();
        this.jTextField_Answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void pow(){
        double firstValue = Double.valueOf(jTextField_fiValue.getText());
        double secondValue = Double.valueOf(jTextField_seValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.pow();
        this.jTextField_Answer.setText(this.miniCaculatorModel.getAnswer()+"");    }

    public void mod(){
        double firstValue = Double.valueOf(jTextField_fiValue.getText());
        double secondValue = Double.valueOf(jTextField_seValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.mod();
        this.jTextField_Answer.setText(this.miniCaculatorModel.getAnswer()+"");    }
}
