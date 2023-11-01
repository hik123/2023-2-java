package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// data access object
public class BoardDao { // Vo >Value Object / Dto >Data Transfer Object 데이터를 옮길때 쓰는 객체 / Entity > Entity DB와
    public static int insBoard(BoardEntity entity) { //title, ctnts, writer
        int result = 0;
        /*String sql = String.format("INSERT INTO board(title, ctnts, writer)" +
                "VALUES" +
                "('%s', '%s', '%s')"
                , entity.getTitle(), entity.getCtnts(), entity.getWriter());
         */

        String sql = "INSERT INTO board(title, ctnts, writer) " +
                     "Values" +
                     "(?, ?, ?)";

        System.out.println(sql);
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql); //주소값. 인스턴스메소드 //PreparedStatement 쓰면 "(?, ?, ?)"가능
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
                                                        //FirstInLastOut
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;

        }
    public static BoardEntity selBoardById(int iboard) {
        Connection conn = null;
        PreparedStatement ps = null;

        ResultSet rs = null;
        String sql = " SELECT iboard, title, writer, ctnts, created_at, updated_at " +
                " FROM board WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, iboard);
            rs = ps.executeQuery();
            if(rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return null;
    }

    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; //select했을때 결과물이 담김
        String sql = "SELECT iboard, title, writer, created_at " +
                "FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) { //레코드 있는 수만큼 반복됨
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);

                list.add(entity);
            }


        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }
    public static int updBoard(BoardEntity entity) {
        int result = 0;
        PreparedStatement ps = null;
        Connection con = null;
        String sql = "UPDATE board SET title = ?, ctnts = ?, writer = ?, updated_at = now() where iboard = ? ";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps. setInt(4, entity.getIboard());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }
    public static int delBoard (BoardEntity entity) {
        int result = 0;
        PreparedStatement ps = null;
        Connection con = null;
        String sql = "DELETE FROM board WHERE iboard = ?";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
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
        entity.setTitle("오늘 Insert배움");
        entity.setCtnts("java를 통해 board테이블에 값 넣어봄.");
        entity.setWriter("신난다");
        BoardDao.insBoard(entity); // 다른 클래스 static메소드 호출 class명.메소드()
    }
}

class MyConnTest3 {
    public static void main(String[] args) {
    BoardEntity entity = new BoardEntity();
    entity.setIboard(1);

    int row = BoardDao.delBoard(entity);
        System.out.println("row : " + row);
    }
}
class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(9);
        entity.setTitle("수정 제목9");
        entity.setCtnts("수정 내용9");
        entity.setWriter("수정자9");

        int row = BoardDao.updBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest5 {
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();
        for (BoardEntity entity : list) {
            System.out.println(entity.toString()); //iboard: 값, title: 값, ctnts:값, writer:값, createdAt:값
        }
    }
}

class MyConnTest6 {
    public static void main(String[] args) {
        BoardEntity result = BoardDao.selBoardById(9);
        System.out.println(result);
    }
}




