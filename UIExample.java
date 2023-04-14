import java.awt.*;
import java.awt.event.*;
public class UIExample extends Frame {
    Button button;
public UIExample() {
        setTitle("UI Component Example");
        setSize(300, 200);
button = new Button("Click Me");
        add(button);
 setVisible(true);
  // Add a window listener to handle closing the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
  public static void main(String[] args) {
        UIExample uiExample = new UIExample();
    }
}
