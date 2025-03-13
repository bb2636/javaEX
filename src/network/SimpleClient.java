package network;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;


public class SimpleClient {
  public static void main(String[] args) {
    try(Socket client = new Socket("172.30.1.30",5000);
        OutputStream os = client.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os))
    {
        oos.writeObject("hello server");
        oos.flush();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
