import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class label {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setText("hey whats going on");
        
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBackground(Color.BLACK);
        
        
      


        frame.add(label);
        frame.setVisible(true);
        frame.setSize(400,500);
        frame.getDefaultCloseOperation();
        frame.setBackground(Color.BLUE);
        

    }
    
}
