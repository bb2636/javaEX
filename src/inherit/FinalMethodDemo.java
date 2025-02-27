package inherit;

public class FinalMethodDemo {
  public static void main(String[] args) {
    worldChess wc = new worldChess();
    System.out.println(wc.getFirstPlayer());
  }
}

class Chess {
  enum Player { WHITE, BLACK }

  final Player getFirstPlayer() {
    return Player.WHITE;
  }
}
class worldChess extends Chess {

}