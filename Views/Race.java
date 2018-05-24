package Views;

import Models.DBlib;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Race extends JTable {
    private String[] columnNames = {"联赛", "队伍", "比赛结果"};
    private DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    private JTable jTable = new JTable(model);
    private JButton addButton = new JButton("添加球员信息");
    private JLabel playerIdLabel = new JLabel("队员ID");
    private JTextField playerIdText = new JTextField(30);
    private JLabel playerShoot = new JLabel("该场比赛进球数");
    private JTextField playerShootText = new JTextField(30);

    private JButton addRceaButton = new JButton("添加比赛信息");
    private JLabel raceIdLabel = new JLabel("球队ID");
    private JTextField raceIdText = new JTextField(20);
    private JLabel raceShoot = new JLabel("比赛获得积分");
    private JTextField raceText = new JTextField(20);

    public void placeComponents(JPanel panel) {
        JScrollPane scrollPane = new JScrollPane(jTable);
        panel.setLayout(new FlowLayout());
        panel.add(playerIdLabel);
        panel.add(playerIdText);
        panel.add(playerShoot);
        panel.add(playerShootText);
        panel.add(addButton);

        panel.add(raceIdLabel);
        panel.add(raceIdText);
        panel.add(raceShoot);
        panel.add(raceText);


        panel.add(addRceaButton);
//        展示球队信息
//        panel.add(scrollPane);

        jTable.setPreferredScrollableViewportSize(new Dimension(800, 400));
//        DefaultTableModel model2 = (DefaultTableModel) jTable.getModel();
        String[] column1 = {"1组", "球队1", "1"};
        model.addRow(column1);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String playerId = playerIdText.getText();
                String playerShoot = playerShootText.getText();
                String[] data = {playerId, playerShoot};
                insertRow(data);
//                String sql = "UPDATE player_info SET total_shot = total_shot + " + playerShoot + " WHERE id = " + playerId;
//                DBlib.operateData(sql);
//                String sql1 = "UPDATE team_info SET integral = integral +" + xxx + " WHERE team_id =" + xx + " AND league='联赛" + xxx + "'";
//                DBlib.operateData(sql1);
                playerIdText.setText("");
                playerShootText.setText("");
            }
        });
    }

    public void insertRow(String[] data) {
        model.addRow(data);
    }

    public void setColWidth(JTable table) {
        TableColumnModel colmodel = table.getColumnModel();
    }
}
