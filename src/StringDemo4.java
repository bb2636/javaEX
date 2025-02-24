public class StringDemo4 {
  public static void main(String[] args) {
    //문자열 조작
    String s1 = new String("hi,");
    String s2 = new String(" java");

    System.out.println(s2.charAt(4));
    System.out.println(s2.charAt(s2.length() -1));
    for (int i = 0; i < s2.length(); i++) {
      System.out.println(s2.charAt(i));
    }
    System.out.println(s1);
    s1 = s1.toUpperCase();
    System.out.println(s1);

    //문자열 정적 메서드
    String str = "" + 3.14;
    String str1 = String.valueOf(3.14);
    String fruits = String.join(",","apple","banana","cherry","durian");
    System.out.println("fruits = " + fruits); //delimiter = 구분자(, 등)
    String str3 = String.format("%s %d", "jdk", 14);
    System.out.println("str3 = " + str3);

    // string block
    String strBlock = """
        <html>
          <body>
            <p>hello, world</p>
          </body>
        </html>
        """;
    System.out.println("strBlock = \n" + strBlock);
  }
}
