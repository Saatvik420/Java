import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {

  private JTextField usernameField;
  private JPasswordField passwordField;

  public LoginForm() {
    setTitle("Login form");

    JPanel panel = new JPanel(new GridLayout(3, 2));

    JLabel usernameLabel = new JLabel("test your Username here:");
    usernameField = new JTextField(20);
    JLabel passwordLabel = new JLabel("Test your Password here:");
    passwordField = new JPasswordField(20);

  
    panel.add(usernameLabel);
    panel.add(usernameField);
    panel.add(passwordLabel);
    panel.add(passwordField);

 
    JButton loginButton = new JButton("Press here");
    loginButton.addActionListener(this);
    panel.add(loginButton);
    add(panel);
    setLocationRelativeTo(null);
    setSize(300, 150);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String username = usernameField.getText();
    String password = String.valueOf(passwordField.getPassword());
    if (username.equals("User") && password.equals("Shhhhh")) {
      JOptionPane.showMessageDialog(null, "You win");
    } else {
      JOptionPane.showMessageDialog(null, "Try again you loser!");
    }
  }

  public static void main(String[] args) {
    new LoginForm();
  }
}
