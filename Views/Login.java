package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JLabel userLabel = new JLabel("User:");
    private JTextField userText = new JTextField(20);
    private JPasswordField passwordText = new JPasswordField(20);
    private JLabel passwordLabel = new JLabel("Password:");
    private JButton loginButton = new JButton("login");

//    public void  start (JPanel panel) {
//        this.placeComponents(panel);
//        this.judgePassword();
//    }

    public void placeComponents(JPanel panel) {
//        panel.setSize(500, 300);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
//        panel.setLayout(null);
        userLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        userLabel.setForeground(Color.white);
        panel.add(userLabel);
        panel.add(userText);

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        passwordLabel.setForeground(Color.white);
        panel.add(passwordLabel);

        panel.add(passwordText);

        panel.add(loginButton);
    }

    public boolean judgePassword() {
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String pwd = String.valueOf(passwordText.getPassword());
                System.out.println(username + pwd);
            }
        });
        return false;
    }
}
