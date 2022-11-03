/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import java.awt.event.ActionListener;
import clicker.applicationlogic.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author klazutin
 */
public class ClickListener implements ActionListener {
    private JLabel label;
    private Calculator calc;
    
    public ClickListener(Calculator calc, JLabel label) {
        this.label = label;
        this.calc = calc;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        calc.increase();
        label.setText(String.valueOf(calc.giveValue()));
    }
    
}
