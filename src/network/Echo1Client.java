package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Echo1Client {
  public static void main(String[] args) throws IOException {
    Socket client = null;
    PrintWriter out = null;

    client = new Socket();
    System.out.println("에코 서버와 연결 중");
    client.connect(new InetSocketAddress("localhost", 5000),3000);
    System.out.println("에코 서버와 연결 성공");

    out = new PrintWriter(client.getOutputStream(),true);

    Scanner in = new Scanner(System.in);
    String msg = "";

    System.out.print("보낼 메세지 입력 (종료 시 \"끝\" 입력)  : ");
    while ((msg = in.nextLine()) != null) {
      if (msg.contains("끝")) break;
      out.println(msg);
      System.out.print("보낼 메세지 입력 (종료 시 \"끝\" 입력)  : ");
    }
    System.out.println("서버 종료");
    in.close();
    client.close();
    out.close();
  }
}
