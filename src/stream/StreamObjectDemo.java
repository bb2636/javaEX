package stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamObjectDemo {
  public static void main(String[] args) {
    List<Nation> nations = Nation.nations;
    Stream<Nation> stream = nations.stream();
    stream.filter(n -> n.getPopulation() >= 100)
        .limit(2)
        .forEach(nation ->
            System.out.println("인구가 1억 이상인 나라 " + nation.getName()));
  }
}
