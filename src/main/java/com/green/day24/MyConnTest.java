package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        //MyConn에 있는 getConn 메소드 호출 후 메소드 리턴해주는 값 담기
        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country_id, country)" +
                "VALUES (110, '경현나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
