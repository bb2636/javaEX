package network;

import java.sql.*;

public class DBDemo2 {
  public static void main(String[] args) throws SQLException{
    Connection con = makeConnection();
    //?는 아무거나 들어갈 수 있는 값
    String sql = "update person set email = '?' where phone = '?' and name = '?' ;";

    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setString(1,"limlim@naver.com");
    pstmt.setString(2,"010-444-4444");
    pstmt.setString(3,"임꺽정");

    int rows = pstmt.executeUpdate(sql);
      if (rows == 1) {
        System.out.println("정상적 수정");
      } else {
        System.out.println("수정 실패");
      }
      if(pstmt != null) {
        pstmt.close();
      }
      if (con != null) {
        con.close();
      }
  }


  private static Connection makeConnection() {
    //접속하려는 db 정보
    String url = "jdbc:mysql://localhost:3306/contacts?serverTimezone=Asia/Seoul";
    Connection con = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("db 연결중");
      con = DriverManager.getConnection(url,"root","1111");
      System.out.println("db 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("jdbc 드라이버 찾지 못함");
      System.out.println(e.getMessage());
    } catch (SQLException e) {
      System.out.println("db 연결 실패");
    }
  return con;
  }
}
