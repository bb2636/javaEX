package example;

public class Ex1 {
  public static void main(String[] args) {
    System.out.println(countChar("hello", 'l'));
    System.out.println(countChar("hello",'L'));
  }

  public static int countChar(String s, char c) {
    int count =0;
//    c = String.valueOf(c).toLowerCase().charAt(0);
//    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      if (s.toUpperCase().charAt(i) == c || s.toLowerCase().charAt(i) == c) {
        count ++;
      }
    }
    return count;
  }
}
