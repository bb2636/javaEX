public class NumberTypeDemo {
  public static void main(String[] args) {
    int mach = 340;
    int distance = mach * 60 * 60;
    //문자열과 숫자를 더하면 > 문자열
    System.out.println("소리가 1시간 동안 가는 거리 : " + distance);

    //실수 선언하고 사용
    double radius = 10.0;
    final double PI = 3.14159265;
    double area = radius * radius * PI;
    System.out.println("반지름이 " + radius + "일 때 원의 넓이 : " + area);
  }
}
