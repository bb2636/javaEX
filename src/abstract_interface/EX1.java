package abstract_interface;

public class EX1 {
  public static void main(String[] args) {
    Concrete c = new Concrete(100, 50);
    c.show();
  }
}

abstract class Abstract {
  int i;

  public Abstract(int i) {
    this.i = i;
  }
  abstract void show();
}

class Concrete extends Abstract {
  int i;

  public Concrete(int i, int n) {
    super(i);
    this.i = n;
  }

  @Override
  void show() {
    System.out.println(super.i + this.i);
  }
}

