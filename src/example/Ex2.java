package example;

public class Ex2 {
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4));
    int[] arr = {2,3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1,2,3,4,5));
  }
  public static int sum(int i, int... values) {
    int total = 0;
    for( int value : values) {
      total += value;
    }
      return total;
  }
}
