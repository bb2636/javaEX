public class CallByValue2 {
  public static void main(String[] args) {
  RefValue ref = new RefValue();
  ref.x = 10;
    System.out.println("호출 전 x = "+ ref.x);
    //changePrimitive(ref.x);
    changeReference(ref);
    System.out.println("호출 후 x = "+ ref.x);
  }//main end

  static void changePrimitive(int n) {
    //값 자체를 읽어만 와서 변경 불가능
    System.out.println("메소드 실행 전 n = " + n);
    n = 1000;
    System.out.println("메소드 실행 후 n = " + n);
  }//primitive end

  static void changeReference(RefValue ref) {
    //참조변수 자체를 넘김 > 직접 주소로 가서 값을 변경함
    System.out.println("메소드 실행 전 n = " + ref.x);
    ref.x = 1000;
    System.out.println("메소드 실행 후 n = " + ref.x);
  }//reference end
}//class end

class RefValue {
  int x;

}//refValue end
