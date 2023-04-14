import java.awt.*;
import java.awt.event.*;

public class BloodDonationForm1 extends Frame implements ActionListener {
    private Label nameLabel, ageLabel, bloodGroupLabel, lastDonationLabel;
    private TextField nameField, ageField, bloodGroupField, lastDonationField;
    private Checkbox readyToDonateCheckbox;
    private Button submitButton;

  
   
    public BloodDonationForm1() {
        super("Blood Donation Form");
        
        nameLabel = new Label("Name:");
        ageLabel = new Label("Age:");
        bloodGroupLabel = new Label("Blood Group:");
        lastDonationLabel = new Label("Last Donation Date:");
        
        nameField = new TextField(20);
        ageField = new TextField(3);
        bloodGroupField = new TextField(3);
        lastDonationField = new TextField(10);
        
        readyToDonateCheckbox = new Checkbox("Ready to donate");
        
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        
        setLayout(new GridLayout(6, 2));
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(bloodGroupLabel);
        add(bloodGroupField);
        add(lastDonationLabel);
        add(lastDonationField);
        add(new Label());
        add(readyToDonateCheckbox);
        add(new Label());
        add(submitButton);
        
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String bloodGroup = bloodGroupField.getText();
            String lastDonationDate = lastDonationField.getText();
            boolean readyToDonate = readyToDonateCheckbox.getState();
            
            // You can write the code here to store the data in a database or send it to the organizer
            // for further processing.
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Blood Group: " + bloodGroup);
            System.out.println("Last Donation Date: " + lastDonationDate);
            System.out.println("Ready to donate: " + readyToDonate);
        }
               
               
    }
    
    public static void main(String[] args) {
        new BloodDonationForm();
    }
}
