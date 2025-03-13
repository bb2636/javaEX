package network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo1 {
  public static void main(String[] args) throws SQLException{
    Connection con = makeConnection();
    String sql = "insert into person values ('임꺽정', '010-444-4444', 'lim@a.com');";

      Statement stmt = con.createStatement();
      int rows = stmt.executeUpdate(sql);
      if (rows == 1) {
        System.out.println("정상적 추가");
      } else {
        System.out.println("추가 실패");
      }

      con.close();
      stmt.close();
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
