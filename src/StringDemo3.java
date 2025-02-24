import java.sql.SQLOutput;

public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "hi, java"; //0x100
    String s2 = "hi, java"; //0x100
    System.out.println("s1 == s2?? "+ (s1 == s2)); //true

    String s3 = new String("hi, java"); //0x200
    String s4 = new String("hi, java"); //0x300
    System.out.println("s3 == s4??"  + (s3 == s4)); //false

    s1 = s3;
    System.out.println("s1 == s3?? " + (s1 == s3)); //true
    System.out.println("문자열의 값이 같은가? " + s1.equals(s4)); //true

    String a = "apple";
    String b = "banana";
    String c = "BANANA";

    System.out.println(a.compareTo(b));
    System.out.println(b.compareTo(a));
    System.out.println(c.compareTo(b));
    System.out.println(c.compareToIgnoreCase(b));
  }
}
