package com.github.jdbc.util;

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtils {
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;
    // 类加载的时候此处代码块就被调用，相当于一个初始化的过程
    static {
        //此对象是用于加载properties文件数据的
        ResourceBundle rb = ResourceBundle.getBundle("dbinfo");
        driverClass = rb.getString("driverClass");
        url = rb.getString("url");
        username = rb.getString("username");
        password = rb.getString("password");
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 获取连接对象
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    //关闭连接对象
    public static void closeAll(ResultSet resultSet, Statement stmt, Connection conn){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            resultSet = null; // 让对象置空，快速被垃圾回收
        }
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt = null;
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        conn = null;

    }

}
