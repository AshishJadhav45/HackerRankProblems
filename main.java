import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class main{
    public static void main(String[] args) {
        JFrame frame = new JFrame();// create a frame 
        frame.setSize(400,500);// size of frame
        frame.setVisible(true);// for visible frame
        frame.setTitle("Login page");// set name of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // for close button

        ImageIcon image = new ImageIcon("api icon.png");// for api login icon
        frame.setIconImage(image.getImage());// get call to icon
        frame.getContentPane().setBackground(null);  
    
    
    }
    

}

