package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try (ServerSocket server = new ServerSocket(5000);
         Socket socket = server.accept();
         InputStream is = socket.getInputStream();
         ObjectInputStream ois = new ObjectInputStream(is))
    {
      String as = (String) ois.readObject();
      System.out.println("받은 문자열 " + as);
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
