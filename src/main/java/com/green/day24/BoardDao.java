package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

// data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { //title, ctnts, writer
        int result = 0;
        String sql = String.format("INSERT INTO board(title, ctnts, writer)" +
                "VALUES" +
                "('%s', '%s', '%s')"
                , entity.getTitle(), entity.getCtnts(), entity.getWriter());

        System.out.println(sql);

        try {
            Connection con = MyConn.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }
}

class MyConnTest2 {
    public static void main(String[] args) {
        //title : 처음 작성
        //ctnts : 처음 작성하는 내용입니다.
        //writer : 홍길동
        //DB에 INSERT 해주세요.
        BoardEntity entity = new BoardEntity();
        entity.setTitle("처음 작성");
        entity.setCtnts("처음 작성하는 내용입니다.");
        entity.setWriter("홍길동");
        BoardDao.insBoard(entity); // 다른 클래스 static메소드 호출 class명.메소드()
    }
}


