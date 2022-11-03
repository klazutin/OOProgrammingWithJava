
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class ActionHandler implements ActionListener {
    private Calculator calc;
    private JTextField input;
    private JTextField output;
    private JButton buttonZ;
    
    public ActionHandler (Calculator calc, JTextField input, JTextField output, JButton buttonZ) {
        this.calc = calc;
        this.input = input;
        this.output = output;
        this.buttonZ = buttonZ;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae);
        int value = 0;
        int inputValue = 0;
        try {
            inputValue = Integer.parseInt(this.input.getText());
        }
        catch (NumberFormatException e) {
            System.out.println(e);
            this.input.setText("");
        }
        
        if (ae.getActionCommand().equals("+")) {
            this.calc.add(inputValue);
            this.input.setText("");
            value = this.calc.getValue();
            this.buttonZ.setEnabled(true);
        }
        else if (ae.getActionCommand().equals("-")) {
            this.calc.subtract(inputValue);
            this.input.setText("");
            value = this.calc.getValue();
            this.buttonZ.setEnabled(true);
        }
        else if (ae.getActionCommand().equals("Z")) {
            this.input.setText("");
            value = 0;
            this.buttonZ.setEnabled(false);
        }
        this.output.setText(String.valueOf(value));
    }
}
