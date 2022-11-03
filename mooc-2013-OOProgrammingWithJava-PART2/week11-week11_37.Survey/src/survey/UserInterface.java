package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        JLabel text1 = new JLabel("Are you?");
        container.add(text1);
        JCheckBox cb1 = new JCheckBox("Yes!");
        container.add(cb1);
        JCheckBox cb2 = new JCheckBox("No!");
        container.add(cb2); 
        JLabel text2 = new JLabel("Why?");
        container.add(text2);    
        ButtonGroup btnGroup = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("No reason.");
        btnGroup.add(rb1);
        container.add(rb1);
        JRadioButton rb2 = new JRadioButton("Because it is fun!.");
        btnGroup.add(rb2);   
        container.add(rb2);
        JButton btn1 = new JButton("Done!");
        container.add(btn1);
        
        
//        JButton button = new JButton("Click!");
//        container.add(button);
//        JLabel text = new JLabel("Text.");
        

        
    }


    public JFrame getFrame() {
        return frame;
    }
}
