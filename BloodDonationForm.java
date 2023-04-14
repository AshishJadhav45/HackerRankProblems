import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class BloodDonationForm extends Frame implements ActionListener {
    Label nameLabel, ageLabel, bloodGroupLabel, lastDonationLabel, donateLabel;
    TextField nameText, ageText, bloodGroupText, lastDonationText;
    CheckboxGroup donateGroup;
    Checkbox yesCheckbox, noCheckbox;
    Button submitButton, cancelButton;

    public BloodDonationForm() {
        // set frame properties
        setTitle("Blood Donation Form");
        setSize(400, 300);
        setLayout(new GridLayout(7, 2));
        setResizable(false);

        // create labels
        nameLabel = new Label("Name: ");
        ageLabel = new Label("Age: ");
        bloodGroupLabel = new Label("Blood Group: ");
        lastDonationLabel = new Label("Last Donation Date: ");
        donateLabel = new Label("Are you ready to donate today? ");

        // create text fields
        nameText = new TextField();
        ageText = new TextField();
        bloodGroupText = new TextField();
        lastDonationText = new TextField();
        lastDonationText.setText(new Date().toString()); // set current date as default

        // create checkbox group
        donateGroup = new CheckboxGroup();
        yesCheckbox = new Checkbox("Yes", donateGroup, true);
        noCheckbox = new Checkbox("No", donateGroup, false);

        // create buttons
        submitButton = new Button("Submit");
        cancelButton = new Button("Cancel");

        // add components to frame
        add(nameLabel);
        add(nameText);
        add(ageLabel);
        add(ageText);
        add(bloodGroupLabel);
        add(bloodGroupText);
        add(lastDonationLabel);
        add(lastDonationText);
        add(donateLabel);
        add(yesCheckbox);
        add(noCheckbox);
        add(submitButton);
        add(cancelButton);

        // add action listeners
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // add window listener to close the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // get form data
            String name = nameText.getText();
            int age = Integer.parseInt(ageText.getText());
            String bloodGroup = bloodGroupText.getText();
            String lastDonation = lastDonationText.getText();
            boolean readyToDonate = donateGroup.getSelectedCheckbox().getLabel().equals("Yes");

            // display form data
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Blood Group: " + bloodGroup);
            System.out.println("Last Donation Date: " + lastDonation);
            System.out.println("Ready to Donate Today: " + readyToDonate);

            // clear form data
            nameText.setText("");
            ageText.setText("");
            bloodGroupText.setText("");
            lastDonationText.setText(new Date().toString());
            yesCheckbox.setState(true);
        } else if (e.getSource() == cancelButton) {
            dispose();
        }
    }

    public static void main(String[] args) {
        BloodDonationForm form = new BloodDonationForm();
        form.setVisible(true);
    }
}
