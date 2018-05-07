package Views;

import javax.swing.*;
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
        panel.setLayout(null);

        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // 创建登录按钮
        loginButton.setBounds(10, 80, 80, 25);
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
