public class ForDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) { //10까지 짝수만 출력하기
      if(i %2 == 1) {
        System.out.println(i+1);
      }
    }
    for (int row = 2; row < 10; row++) {//구구단 출력하기
      for (int column = 1; column < 10; column++) {
        System.out.printf("%4d", row * column);

      }
      System.out.println();
    }
  }
}
