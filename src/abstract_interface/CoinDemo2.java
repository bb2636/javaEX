package abstract_interface;

public class CoinDemo2 implements Coin{
  //인터페이스 상속받음 > 상수 이름만으로 사용 가능
  public static void main(String[] args) {
    System.out.println("dime 는 " + DIME + "센트입니다");
    System.out.println("quarter 는 " + QUARTER + "센트입니다");
  }
}
