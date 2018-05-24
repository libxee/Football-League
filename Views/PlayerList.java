package Views;

import Models.Player;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class PlayerList extends JTable {
    private String[] columnNames = {"队员ID", "姓名", "位置", "球队", "球队ID", "进球数"};
    private DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    private JTable jTable = new JTable(model);
    private JButton addButton = new JButton("添加球员信息");
    private JLabel playerIdLabel = new JLabel("队员ID");
    private JTextField playerIdText = new JTextField(20);
    private JLabel playerName = new JLabel("姓名");
    private JTextField playerNameText = new JTextField(20);
    private JLabel playerTeam  = new JLabel("球队名");
    private JTextField playerTeamId  = new JTextField(20);

    public void placeComponents(JPanel panel) {
        JScrollPane scrollPane = new JScrollPane(jTable);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(playerIdLabel);
        panel.add(playerIdText);
        panel.add(playerName);
        panel.add(playerNameText);
        panel.add(addButton);
        panel.add(playerTeam);
        panel.add(playerTeamId);
        panel.add(scrollPane);
        jTable.setPreferredScrollableViewportSize(new Dimension(800, 400));
//        DefaultTableModel model2 = (DefaultTableModel) jTable.getModel();
//        String[] column1 = {"1", "fucker", "大前锋", "1", "10", "3"};
//        model.addRow(column1);
        List<String[]> list = Player.getPlayer();
        for (int i = 0; i < list.size(); i++) {
            String[] Trans = list.get(i);
            System.out.println(Arrays.toString(list.get(i)));
            model.addRow(list.get(i));
        }
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String playerId = playerIdText.getText();
                String playerName = playerNameText.getText();
                String playerTeam = playerTeamId.getText();
                String[] data = {playerId, playerName,"xx",playerTeam};
                insertRow(data);
//                Player.setPlayer(playerName, "xxx", "蛇皮队", 1);
                Player.setPlayer(playerName, "xxx", playerTeam, 1);
                playerIdText.setText("");
                playerNameText.setText("");
                playerTeamId.setText("");
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
