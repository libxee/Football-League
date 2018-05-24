package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBlib {


    static final String DB_URL = "jdbc:mysql://119.29.235.55:3306/javaexp?useUnicode=true&characterEncoding=utf-8";

    static final String USER = "javaexp";
    static final String PASS = "gYEcAeFHOVMz8xPY";


    public Connection getCon() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static List<String[]> queryPlayer(String sql) {

        Connection conn = null;
        Statement stmt = null;
        List<String[]> list = new ArrayList<String[]>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String type_name = rs.getString("type_name");
                String team_name = rs.getString("team_name");
                int team_id = rs.getInt("team_id");
                String[] item = {String.valueOf(id), name, type_name, team_name, String.valueOf(team_id)};
                list.add(item);
            }
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String[]> queryTeam(String sql) {
        Connection conn = null;
        Statement stmt = null;
        List<String[]> list = new ArrayList<String[]>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
//                int team_id = rs.getInt("team_id");
//                String type_name = rs.getString("team_name");
//                int win_count = rs.getInt("win_count");
//                int if_off = rs.getInt("if_offplays");
//                int integral = rs.getInt("integral");
                String team_name = rs.getString("team_name");
                String team_league = rs.getString("league");
                int team_integral = rs.getInt("integral");
                int off_integral = rs.getInt("off_integral");
                String[] item = {team_league, team_name, String.valueOf(team_integral), String.valueOf(off_integral)};
                list.add(item);
            }
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static Boolean operateData(String sql) {
        Connection conn = null;
        Statement stmt = null;
        Boolean judger = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows);
            if (rows > 0) {
                judger = true;
            }
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return judger;
    }

}
