public class PrintDemo {
  public static void main(String[] args) {
    System.out.print("hello");
    System.out.print("hello"); //행변환 없이 붙여서 출력됨

    System.out.printf("%s: %s: %s \n", "a","b","c");
    System.out.printf(":%d: :%s04d: :%-4d: \n", 1,2,3);

    System.out.printf("%s %d %s \n", "이것은 우리의 ", 9 ,"번째 프로그램입니다");

    int i = 2; int j = 1;
    int result = i * j;
    System.out.printf("%d x %d = %d 입니다 \n", i, j, result);
  }
}
