public class Main1 {
  public static void main(String[] args) {
    MyMath m = new MyMath();
    long res1 = m.add(10L, 20L);
    System.out.println("res1 = " + res1);
    long res2 = m.sub(20L, 10L);
    System.out.println("res2 = " + res2);
    long res3 = m.mul(1L, 10L);
    System.out.println("res3 = " + res3);
    long res4 = m.div(3L, 2L);
    System.out.println("res4 = " + res4);

    MyMath m2 = new MyMath();
    System.out.println(m2.add(1,2));

    MyMath m3 = new MyMath();
    System.out.println(m3.sub(3,1));
  }
}

