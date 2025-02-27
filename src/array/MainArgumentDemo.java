package array;

public class MainArgumentDemo {
  public static void main(String[] args) {
    if(args.length == 2 ) {
      //args[0] 출력할 문자열
      //args[1] 돌릴 횟수
      int count = Integer.parseInt(args[1]);
      printCount(count, args[0]);
//      for (int i = 0; i < count; i++) {
//        System.out.println(args[0]);
//      }
    } else {
      System.out.println("안녕");
    }
  }
  private static void printCount(int count, String arg) {
    for (int i = 0; i < count; i++) {
      System.out.println(arg);
    }
  }
}
