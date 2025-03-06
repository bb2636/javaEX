package exception_handle;

public class GenericDemo3 {
  public static void main(String[] args) {
    Cup<Boricha> c = new Cup<>(); //정해진 타입만 담을 수 있도록 설정
    Boricha b = new Boricha();
    c.setBeverage(b); //보리차로 자동 타입 설정됨 > 형변환이 필요없음

    //Beer beer = new Beer();
    //c.setBeverage(beer); 위에서 정한 타입이 아니기 때문에 담을 수 없음

    Cup<Beer> cb = new Cup<>();
    Beer beer = new Beer();
    cb.setBeverage(beer);
    cb.getBeverage().drinkBeer(); //불필요한 타입 체크 필요없음 > 필요한 필수요소만 사용
  }
}
