
package Views;

import javax.swing.*;

public class FrontPage {

    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

        Login login = new Login();
        login.placeComponents(panel);
        if (login.judgePassword()) {
            PlayerItem.placeComponents(frame);
        }
        frame.setVisible(true);
    }

}