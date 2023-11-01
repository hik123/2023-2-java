package com.green.day24;

import java.sql.*;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_User = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_User, DB_PASSWORD);
        } catch (Exception e) {
            System.out.println("에러발생!!");
            e.printStackTrace();
        }
        System.out.println("접속 성공!!");
        return conn;
    }
    public static void close(Connection conn, PreparedStatement ps) {
        if(ps != null) {
            try { ps.close(); } catch (Exception e) { e.printStackTrace(); }
        }
        if(conn != null) {
            try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        close(conn, ps);
    }
}
