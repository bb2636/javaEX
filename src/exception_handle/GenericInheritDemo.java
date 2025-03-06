package exception_handle;

import java.util.ArrayList;

public class GenericInheritDemo {
  public static void main(String[] args) {
    ArrayList<Beverage> list1 = new ArrayList<>();
    list1.add(new Beverage());
    list1.add(new Beer());
    list1.add(new Boricha()); //원소 끼리 상속관계 > beverage 자식들 생성 가능

    beverageTest(list1); //타입이 같아서 list1 넣을 수 있음

    Beverage b1 = list1.get(0);
    Beer b2 = (Beer) list1.get(1); //맥주이지만 베버리지 타입으로 메서드 사용 못함 > 다운캐스팅하기
    b2.drinkBeer();
    Boricha b3 = (Boricha) list1.get(2);
    b3.drinkBoricha();

    ArrayList<Beer> list2 = new ArrayList<>();
    list2.add(new Beer()); //beer만 생성 가능 보리차 베버리지 불가능
  }

  static void beverageTest(ArrayList<Beverage> list) {

  }
}
