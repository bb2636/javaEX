public class StringDemo2 {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";

    System.out.println(s1 == s2); //true

    String s3 = new String("hello");
    String s4 = new String("hello");

    System.out.println(s3 == s4); //false

    s2 = "hello world";
    System.out.println(s1 ==s2); //false
  }
}
