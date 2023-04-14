import javax.swing.*;
public class DialogExample {
    public static void main(String[] args) {
        // Show input dialog
        String input = JOptionPane.showInputDialog("Enter your name:");
        System.out.println("Your name is: " + input);

        // Show message dialog
        JOptionPane.showMessageDialog(null, "Hello, " + input + "!", "Greeting", JOptionPane.INFORMATION_MESSAGE);

        // Show confirm dialog
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
