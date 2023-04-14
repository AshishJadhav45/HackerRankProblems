import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListBoxExample {
    private JFrame frame;
    private JList<String> list;
    private JLabel label;

    public ListBoxExample() {
        frame = new JFrame("List Box Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"item 1", "item 2", "item 3", "item 4", "item 5"};
        list = new JList<>(items);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                label.setText("Selected: " + list.getSelectedValue());
            }
        });

        JScrollPane scrollPane = new JScrollPane(list);
        label = new JLabel("Selected: ");

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ListBoxExample();
    }
}
