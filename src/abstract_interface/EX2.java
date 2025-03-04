package abstract_interface;

public class EX2 implements Delicious{

  @Override
  public void eat() {

  }

  @Override
  public void sweet() {

  }
}

interface Edible {
  void eat();
}
interface Sweetable {
  void sweet();
}
interface Delicious extends Edible, Sweetable {

}