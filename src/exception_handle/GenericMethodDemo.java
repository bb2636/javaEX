package exception_handle;

public class GenericMethodDemo {
  static class Utils {
    public static <T extends  Number> void showArray(T[]a) {
      //<T> 만 있으면 T에 아무 타입 가능
      //<T extends Number> 숫자 타입만으로 제한 둠
      for(T t: a) { //T에서 a를 받아온 후 하나씩 출력
        System.out.println(t);
      }
    }
  }


  public static void main(String[] args) {
    Integer[] a = {1,2,3,4,5};
    Double[] b = {1.0,2.0,3.0,4.0,5.0};
    Character[]  c = {'a','b','c','d','e'};
    Boolean[] d = {true, false};

    Utils.showArray(a);
    Utils.showArray(b);
    //Utils.showArray(c); //숫자가 아닌 char 타입은 불가능
    //Utils.showArray(d);
  }
}
