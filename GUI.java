import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JComboBox<String> choice;
    private JCheckBox checkbox;
    private JRadioButton radio1, radio2;
    private ButtonGroup radioGroup;
    private JButton submit;

    public GUI() {
        // Create the window and panel
        frame = new JFrame("GUI");
        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        // Create the choice
        String[] options = {"Option 1", "Option 2", "Option 3"};
        choice = new JComboBox<String>(options);

        // Create the checkbox
        checkbox = new JCheckBox("Checkbox");

        // Create the radio buttons
        radio1 = new JRadioButton("Radio 1");
        radio2 = new JRadioButton("Radio 2");
        radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);

        // Create the submit button and add an action listener
        submit = new JButton("Submit");
        submit.addActionListener(this);

        // Add the components to the panel
        panel.add(new JLabel("Select an option:"));
        panel.add(choice);
        panel.add(new JLabel("Check the box:"));
        panel.add(checkbox);
        panel.add(new JLabel("Select a radio button:"));
        panel.add(radio1);
        panel.add(radio2);
        panel.add(submit);

        // Set the frame properties
        frame.add(panel);
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the selected options and print them
        String selectedChoice = (String) choice.getSelectedItem();
        boolean selectedCheckbox = checkbox.isSelected();
        String selectedRadio = radio1.isSelected() ? "Radio 1" : "Radio 2";
        System.out.println("Selected choice: " + selectedChoice);
        System.out.println("Selected checkbox: " + selectedCheckbox);
        System.out.println("Selected radio button: " + selectedRadio);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
