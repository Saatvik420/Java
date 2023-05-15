import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class RegistrationForm extends JFrame {
  
  public RegistrationForm() {
    setTitle("Registration Form");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel topPanel = new JPanel(new GridLayout(4, 2));
    JPanel bottomPanel = new JPanel();
    
    topPanel.add(new JLabel("Who are you: "));
    topPanel.add(new JTextField());
    topPanel.add(new JLabel("Show your id: "));
    topPanel.add(new JTextField());
    topPanel.add(new JLabel("What is this: "));
    topPanel.add(new JPasswordField());
    topPanel.add(new JLabel("Are you kidding: "));
    topPanel.add(new JPasswordField());
    
    bottomPanel.add(new JButton("Kaboom"));
    
    add(topPanel, BorderLayout.CENTER);
    add(bottomPanel, BorderLayout.SOUTH);

    setSize(200, 100);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new RegistrationForm();
  }
}
