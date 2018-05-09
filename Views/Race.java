package Views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Race extends JTable {
    private String[] columnNames = {"举办地ID", "举办地", "比赛日期", "队伍", "比赛结果"};
    private DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    private JTable jTable = new JTable(model);
    private JButton addButton = new JButton("添加球员信息");
    private JLabel playerIdLabel = new JLabel("队员ID");
    private JTextField playerIdText = new JTextField(20);
    private JTextField playerShootText = new JTextField(20);

    public void placeComponents(JPanel panel) {
        JScrollPane scrollPane = new JScrollPane(jTable);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(playerIdLabel);
        panel.add(playerIdText);
        panel.add(playerShootText);
        panel.add(addButton);
        panel.add(scrollPane);
        jTable.setPreferredScrollableViewportSize(new Dimension(800, 400));
//        DefaultTableModel model2 = (DefaultTableModel) jTable.getModel();
        String[] column1 = {"1", "fucker", "大前锋", "1", "10", "3"};
        model.addRow(column1);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String playerId = playerIdText.getText();
                String playerShoot = playerShootText.getText();
                String[] data = {playerId, playerShoot};
                insertRow(data);
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
