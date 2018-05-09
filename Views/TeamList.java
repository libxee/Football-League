package Views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeamList extends JTable {
    private String[] columnNames = { "球队ID","所属联赛","队名"};
    private DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    private JTable jTable = new JTable(model);
    private JButton addButton = new JButton("添加球队信息");
    private JLabel teamIdLabel = new JLabel("球队ID");
    private JTextField teamIdText = new JTextField(20);
    private JLabel teamName = new JLabel("队名");
    private JTextField teamNameText = new JTextField(20);

    public void placeComponents(JPanel panel) {
        JScrollPane scrollPane = new JScrollPane(jTable);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(teamIdLabel);
        panel.add(teamIdText);
        panel.add(teamName);
        panel.add(teamNameText);
        panel.add(addButton);
        panel.add(scrollPane);
        jTable.setPreferredScrollableViewportSize(new Dimension(800, 400));
//        DefaultTableModel model2 = (DefaultTableModel) jTable.getModel();
        String[] column1 = {"1", "业余队", "大前锋", "1", "10", "3"};
        model.addRow(column1);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String playerId = teamIdText.getText();
                String playerName = teamNameText.getText();
                String[] data = {playerId, playerName};
                insertRow(data);
//                teamIdText.setText("");
//                teamNameText.setText("");
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
