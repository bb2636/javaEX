public class CharDemo {
  public static void main(String[] args) {
    char c = 'A'; //==65
    int i = c; //자동형변환

    System.out.println(c);
    System.out.println(i);
    System.out.println((int)c); //값 손실 없는 강제형변환

    String s = "abc";
    System.out.println(s);

    String s1 = s + 1;
    String s2 = ""+ i; //문자열로 변환
    System.out.println(s2+10);

    System.out.println("안녕하세요 \"이수빈\" 입니다.");

    char c3 = 3 + '0'; // 문자로 변환
    System.out.println(c3);

    int i3 = c3 - '0'; //숫자로 변환
    System.out.println(i3 + 10);

    String s3 = "hello";
    System.out.println(s3.charAt(0));
  }
}
