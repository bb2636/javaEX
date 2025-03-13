package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class InetAddressDemo {
  public static void main(String[] args) {
    InetAddress address = null;
    InetAddress address2 = null;
    InetAddress[] addresses = null;
    Scanner in = new Scanner(System.in);
    System.out.print("호스트 이름 입력 : ");
    String url = in.nextLine();
    try {
      address = InetAddress.getByName(url);
      address2 = InetAddress.getLocalHost();
      addresses = InetAddress.getAllByName(url);
    } catch (UnknownHostException e) {
      System.out.println(e.getMessage());
    }
    System.out.println(url + "의 ip주소 : " + Arrays.toString(address.getAddress()));
    System.out.println(url + "의 ip주소 : " + address.getHostAddress());
    System.out.println(url + "의 호스트 이름 : " + address.getHostName());

    System.out.println("로컬 호스트 주소 " +address2);
    System.out.println(url + "의 ip 주소들은 총 " + addresses.length + " 개이며 ");
    Arrays.stream(addresses)
        .forEach(a -> System.out.println(a.getHostAddress()));
  }
}