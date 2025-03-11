package stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopDemo {
  public static void main(String[] args) {
    Nation.nations.stream()
        .peek(nation -> System.out.print(nation.getName()))
        .forEach(nation -> Util.printWithParenthesis(nation.getName()));

    Stream<Nation> peek = Nation.nations.stream()
        .peek(Util::printWithParenthesis);
    Optional<Nation> max = peek.max(Comparator.comparing(Nation::getPopulation));
    System.out.println("인구 수가 가장 많은 나라"+max.get());

    OptionalInt min = IntStream.of(5, 1, 2, 3).min();
    System.out.println(min.getAsInt());

    int sum = IntStream.of(5, 1, 2, 3).sum();
    OptionalDouble average = IntStream.of(5, 1, 2, 3).average();
    System.out.println(average.getAsDouble());
  }
}
