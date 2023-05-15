import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
    private JLabel nameLabel, emailLabel, phoneLabel;
    private JTextField nameField, emailField, phoneField;
    private JButton submitButton;

    public FlowLayoutDemo() {
        super("Ques 4");

        nameLabel = new JLabel("Name: ");
        emailLabel = new JLabel("Email: ");
        phoneLabel = new JLabel("Phone: ");

        nameField = new JTextField(10);
        emailField = new JTextField(10);
        phoneField = new JTextField(10);

        submitButton = new JButton("Submit");

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(phoneLabel);
        add(phoneField);
        add(submitButton);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}