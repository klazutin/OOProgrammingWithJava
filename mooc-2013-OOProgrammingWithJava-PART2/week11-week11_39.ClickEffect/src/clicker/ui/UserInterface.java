package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.BorderLayout;
import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;
    
    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout bl = new BorderLayout();
        container.setLayout(bl);
        
        JLabel label = new JLabel("0");
        JButton button = new JButton("Click!");
        ClickListener cl = new ClickListener(this.calc, label);
        button.addActionListener(cl);
        
        container.add(label, BorderLayout.NORTH);
        container.add(button, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
