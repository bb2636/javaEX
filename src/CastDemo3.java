public class CastDemo3 {
  public static void main(String[] args) {
    int result = 7/4;
    System.out.println(result); // int 끼리는 나머지 버리고 몫만 뜸 > 1 정수이기 때문

    double result2 = 7 / (double)4;
    System.out.println(result2); // 실수 단위 까지 필요한 경우 강제형변환 필요
  }
}
