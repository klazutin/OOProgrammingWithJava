import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calc;
    JTextField output;
    JTextField input;
    
    public GraphicCalculator(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);        
    }
    
    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton buttonPlus = new JButton("+");
        panel.add(buttonPlus);
                
        JButton buttonMinus = new JButton("-");
        panel.add(buttonMinus);
        
        JButton buttonZ = new JButton("Z");
        buttonZ.setEnabled(false);
        panel.add(buttonZ);
         
        ActionListener actionHandler = new ActionHandler(this.calc, this.input, this.output, buttonZ);
        buttonPlus.addActionListener(actionHandler);  
        buttonMinus.addActionListener(actionHandler);  
        buttonZ.addActionListener(actionHandler);  
        
        return panel;
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        output = new JTextField("0");
        output.setEnabled(false);
        container.add(output);      
        
        input = new JTextField("");
        container.add(input);
        
        JPanel panel = createPanel();
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
