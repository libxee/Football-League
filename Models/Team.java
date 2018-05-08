package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Team {


    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://119.29.235.55:3306/javaexp";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "javaexp";
    static final String PASS = "gYEcAeFHOVMz8xPY";

    public static void operateData(String sql) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows);
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static void getTeam() {

    }
//待添加不同sql处理.睡了..
    public static void main(String[] args) {
        operateData("INSERT INTO player VALUES (2,'f','f','fff',10)");

    }
}
