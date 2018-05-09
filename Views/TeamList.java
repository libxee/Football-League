package Views;

import Models.Team;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class TeamList extends JTable {
    private String[] columnNames = {"队名"};
    private DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    private JTable jTable = new JTable(model);
    private JButton addButton = new JButton("添加球队信息");
    //    private JLabel teamIdLabel = new JLabel("球队ID");
//    private JTextField teamIdText = new JTextField(20);
    private JLabel teamName = new JLabel("队名");
    private JTextField teamNameText = new JTextField(20);

    public void placeComponents(JPanel panel) {
        JScrollPane scrollPane = new JScrollPane(jTable);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
//        panel.add(teamIdLabel);
//        panel.add(teamIdText);
        panel.add(teamName);
        panel.add(teamNameText);
        panel.add(addButton);
        panel.add(scrollPane);
        jTable.setPreferredScrollableViewportSize(new Dimension(800, 400));
//        model.addRow(column1);
        List<String[]> list = Team.getTeam();
        for (int i = 0; i < list.size(); i++) {
            String[] Trans = list.get(i);
            System.out.println(Arrays.toString(list.get(i)));
            model.addRow(list.get(i));
        }
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                String playerId = teamIdText.getText();
                String teamName = teamNameText.getText();
                String[] data = {teamName};
                insertRow(data);
                Team.setTeam(teamName);
//                teamIdText.setText("");
                teamNameText.setText("");
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
