import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CirclePanel extends JPanel {
    private int x, y;
    private int diameter = 50;

    public CirclePanel() {
        x = 50;
        y = 50;

        JButton upButton = new JButton("Up");
        upButton.addActionListener(new UpListener());
        add(upButton);

        JButton downButton = new JButton("Down");
        downButton.addActionListener(new DownListener());
        add(downButton);

        JButton leftButton = new JButton("Left");
        leftButton.addActionListener(new LeftListener());
        add(leftButton);

        JButton rightButton = new JButton("Right");
        rightButton.addActionListener(new RightListener());
        add(rightButton);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, diameter, diameter);
    }

    private class UpListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            y -= 10;
            repaint();
        }
    }

    private class DownListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            y += 10;
            repaint();
        }
    }

    private class LeftListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            x -= 10;
            repaint();
        }
    }

    private class RightListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            x += 10;
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Circle Movement");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CirclePanel panel = new CirclePanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
