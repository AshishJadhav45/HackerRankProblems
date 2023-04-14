import java.awt.*;
import java.awt.event.*;

public class AdapterEvent{
     Frame f;
    AdapterEvent(){

    f = new Frame ("Window Adapter");
    f.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
        f.dispose();
    }    
        
    });

       f.setSize(500, 500);
       f.setLayout(null);
       f.setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterEvent();
    }

}
    
