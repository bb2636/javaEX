package stream;

import java.util.List;


public class MapDemo2 {
  public static void main(String[] args) {
    List<Nation> nations = Nation.nations;
    Nation.nations
        .stream()
        .map(Nation::getName)
        .limit(4)
        .forEach(Util::print);
    System.out.println();
    nations.stream()
        .mapToInt(Nation::getGdpRank)
        .forEach(Util::printWithParenthesis);
  }
}
