public class CallByVallue {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("메서드 호출 전 x = " + x);
    method(x);
    System.out.println("메서드 호출 후 x = " + x);
  //x와 i는 별개 >> x의 0이란 값만 넘기는 것이기 때문에 x의 값에는 영향이 없음
  }
  public  static void method(int i) {
    System.out.println("메서드 시작할 때 i =" + i);
    i++;
    System.out.println("메서드 끝날 때 i =" + i);
  }
}
