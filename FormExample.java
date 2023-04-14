import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormExample extends JFrame implements ItemListener {
    private Choice choice;
    private Checkbox checkbox;
    private JRadioButton radioButton1, radioButton2;
    private ButtonGroup radioButtonGroup;
    private JLabel resultLabel;


    public FormExample() {
        setTitle("Form Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        // Create a choice
        panel.add(new JLabel("Select a Fruit: "));
        choice = new Choice();
        choice.add("Apple");
        choice.add("Banana");
        choice.add("Cherry");
        panel.add(choice);

        // Create a checkbox
        panel.add(new JLabel("Select a Color: "));
        checkbox = new Checkbox("Red", true);
        panel.add(checkbox);

        // Create radio buttons
        panel.add(new JLabel("Select a Shape: "));
        radioButton1 = new JRadioButton("Circle", true);
        radioButton2 = new JRadioButton("Square");
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        panel.add(radioButton1);
        panel.add(radioButton2);

        // Create a label to display the result
        panel.add(new JLabel("Result: "));
        resultLabel = new JLabel();
        panel.add(resultLabel);

        // Add the panel to the frame
        add(panel, BorderLayout.CENTER);

        // Add item listeners to the form elements
        choice.addItemListener(this);
        checkbox.addItemListener(this);
        radioButton1.addItemListener(this);
    }



}
