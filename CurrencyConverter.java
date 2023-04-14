import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConverter extends JFrame {
    private JLabel headingLabel, costLabel, resultLabel;
    private JTextField costField;
    private JComboBox<String> currencyCombo;
    private JButton convertButton;
    private String[] currencies = {"USD", "EUR", "GBP", "INR", "CAD"};
    private double[] exchangeRates = {1.0, 1.22, 1.39, 0.014, 0.79};
     public CurrencyConverter() {
        super("Currency Converter");
        setLayout(new GridLayout(4, 2));
        headingLabel = new JLabel("Convert cost from other currencies to USD", SwingConstants.CENTER);
        add(headingLabel);
       costLabel = new JLabel("Enter cost: ", SwingConstants.RIGHT);
        add(costLabel);

        costField = new JTextField(10);
        add(costField);

        currencyCombo = new JComboBox<String>(currencies);
        add(currencyCombo);
       convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConvertListener());
        add(convertButton);
        resultLabel = new JLabel("", SwingConstants.CENTER);
        add(resultLabel);
        setSize(500, 200);
        setVisible(true);
    }
    private class ConvertListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double cost = Double.parseDouble(costField.getText());
            int selectedIndex = currencyCombo.getSelectedIndex();
            double exchangeRate = exchangeRates[selectedIndex];
            double result = cost * exchangeRate;
            resultLabel.setText("Cost in USD: $" + result);
        }
    }
   public static void main(String[] args) {
        new CurrencyConverter();
    }
}


