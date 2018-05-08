package Views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PlayerItem extends JTable {

    public static void placeComponents(JPanel panel) {
//        panel.setLayout(null);
//
//        JLabel PlayerLabel = new JLabel("运动员");
//        PlayerLabel.setBounds(10, 20, 80, 25);
//        panel.add(PlayerLabel);

//        frame.setTitle("JTable测试");
        String[] columnNames = { "火影", "风影", "雷影", "水影", "土影" };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        JTable jTable = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(jTable);
        panel.add(scrollPane);
//        panel.pack();
//        fram.setVisible(true);


        // 获取JTable中的model
        DefaultTableModel model2 = (DefaultTableModel) jTable.getModel();
        String[] column1 = { "初代火影", "初代风影", "初代雷影", "初代水影", "初代土影" };
        model.addRow(column1);

        //获取第一行
        //model.removeRow(0);
    }
}
