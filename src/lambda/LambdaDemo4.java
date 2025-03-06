package lambda;

public class LambdaDemo4 {
  public static void main(String[] args) {
    Roll r = new Roll() {
      @Override
      public int roll() {
        return (int) (Math.random()*6) + 1;
      }
    };
    System.out.println(r.roll());

    Roll r2 = () -> (int) (Math.random()* 6);
    System.out.println(r2.roll());
  }
}
@FunctionalInterface
interface Roll {
  int roll();
}
