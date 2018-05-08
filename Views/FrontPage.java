
package Views;

import javax.swing.*;
import java.awt.*;

public class FrontPage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("League Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                ImageIcon icon = new ImageIcon("/home/stan/IdeaProjects/RatingList/src/wallhaven-622462.jpg");
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(),
                        icon.getIconHeight(), icon.getImageObserver());
                frame.setSize(icon.getIconWidth() / 2, icon.getIconHeight() / 2);
                frame.setLocationRelativeTo(null);
            }
        };

        frame.add(panel);
        Login login = new Login();
        login.placeComponents(panel);
        if (login.judgePassword()) {
            PlayerItem.placeComponents(frame);
        }
        frame.setVisible(true);
    }

}