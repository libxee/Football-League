
package Views;


import javax.swing.*;
import java.awt.*;

public class FrontPage {
    private JFrame frame = new JFrame("League Management System");

    public void showFrontPage() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                ImageIcon icon = new ImageIcon("/home/stan/IdeaProjects/RatingList/src/wallhaven-622462.jpg");
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(),
                        icon.getIconHeight(), icon.getImageObserver());
                frame.setSize(icon.getIconWidth() / 2, icon.getIconHeight() / 2);
                frame.setLocationRelativeTo(null);
                addMenu(frame);
            }
        };

        frame.add(panel);
//        Login login = new Login();
//        login.placeComponents(panel);
//        if (login.judgePassword()) {
//            PlayerItem.placeComponents(panel);
//        }
        frame.setVisible(true);
    }

    public static void addMenu(JFrame jf) {
//        JMenuBar menuBar = new JMenuBar();
//        JMenu fileMenu = new JMenu("球队管理");
//        JMenu editMenu = new JMenu("球员榜");
//        JMenu viewMenu = new JMenu("联赛积分榜");
//        JMenu aboutMenu = new JMenu("关于");
//        menuBar.add(fileMenu);
//        menuBar.add(editMenu);
//        menuBar.add(viewMenu);
//        menuBar.add(aboutMenu);
//        jf.setJMenuBar(menuBar);
//        jf.setVisible(true);
//
//        fileMenu.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("打开  被点击");
//            }
//        });
        JTabbedPane jp = new JTabbedPane(JTabbedPane.TOP);    //设置选项卡在坐标
        JPanel p1 = new JPanel() {
            protected void paintComponent(Graphics g) {
                ImageIcon icon = new ImageIcon("/home/stan/IdeaProjects/RatingList/src/wallhaven-622462.jpg");
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(),
                        icon.getIconHeight(), icon.getImageObserver());
            }
        };
        ;
        new Login().placeComponents(p1);
        JPanel p2 = new JPanel();
        new PlayerItem().placeComponents(p2);
        JPanel p3 = new JPanel();
        jp.add("球队管理", p1);
        jp.add("球员管理", p2);
        jp.add("关于", p3);
        jf.add(jp, BorderLayout.CENTER);   //将选项卡窗体添加到 主窗体上去
    }
}

//gYEcAeFHOVMz8xPY