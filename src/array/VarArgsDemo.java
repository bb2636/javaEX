package array;

public class VarArgsDemo {
  public static void main(String[] args) {
    //메소드 오버로딩
    printSum(1,2,3,4,5);
    printSum(1,2,3,4);
    printSum(10,20,30);
  }

  public static void printSum(int... n) {
    int sum = 0;
    for(int i : n) sum += i;
    System.out.println("sum = " + sum);
  }
}

