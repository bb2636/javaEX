package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
    boolean b1 = Stream.of("a1","b1","c1").anyMatch(x -> x.startsWith("c"));
    System.out.println(b1);
    System.out.println(Stream.of(2,4,6,8,10).allMatch(i -> i%2 == 0));
    System.out.println(Stream.of(2,4,6,8,10).noneMatch(i -> i %2 == 1));
    Stream<Nation> nations = Nation.nations.stream();
    if (nations.allMatch(nation -> nation.getPopulation() > 100)) {
      System.out.println("모든 국가 인구가 1억이 넘음");
    } else {
      System.out.println("모든 국가 인구가 1억을 넘지 않음");
    }

    Optional<Nation> first = Nation.nations.stream().findFirst();
    first.ifPresentOrElse(nation -> System.out.println("첫번째 나라 : "+ nation.getName()),
        () -> System.out.println("해당 국가는 찾을 수 없음"));

    Optional<Nation> any = Nation.nations.stream()
        .filter(n -> n.getGdpRank() < 10).findAny();
    any.ifPresentOrElse(x-> System.out.println("조건 만족하는 국가"+ x.getName()),
        ()-> System.out.println("조건을 만족하는 국가를 찾을 수 없음"));
  }
}
