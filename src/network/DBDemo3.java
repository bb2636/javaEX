package network;

import java.sql.*;

public class DBDemo3 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    String sql = "select * from person";

    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();

    System.out.println(rs);

    while (rs.next()) {
      System.out.print("name : " + rs.getString(1) + ", ");
      System.out.print("phone : " + rs.getString("phone") + ", ");
      System.out.print("email : "+ rs.getString(3) + '\n');
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