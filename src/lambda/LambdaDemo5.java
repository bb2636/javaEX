package lambda;

import java.util.Arrays;

public class LambdaDemo5 {
  public static void main(String[] args) {
    String[] sar = {
        "로마에 가면 로마법을 따라라",
        "시간은 금이다",
        "펜은 칼보다 강하다"
    };
    Arrays.sort(sar);
    System.out.println(Arrays.toString(sar));
    //길이 짧은 순 정렬
    Arrays.sort(sar, (s1,s2) -> s1.length() - s2.length());
    System.out.println(Arrays.toString(sar));
  }
}
