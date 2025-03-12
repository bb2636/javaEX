package stream;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo2 {
  public static void main(String[] args) {
    Stream<Nation> sn = Nation.nations.stream();
    Stream<String> list1 = sn.map(Nation::getName)
        .limit(3);
    List<String> names = list1.collect(Collectors.toList());
    System.out.println("나라이름 3개 : " + names);

    //중복허용x, 순서가 일정하지 않음
    sn = Nation.nations.stream();
    Set<String> names2 = sn.map(Nation::getName)
        .limit(3)
        .collect(Collectors.toSet());
    System.out.println("나라이름 3개(set) : " + names2);

    sn = Nation.nations.stream();
    Map<String, Double> map = sn.filter(Nation::isIsland)
        .collect(Collectors.toMap( Nation::getName, Nation::getPopulation));
    System.out.println("섬인 나라이름 + 인구수 3개(map) : " + map);

    sn = Nation.nations.stream();
    Set<Nation> set = sn.filter(Predicate.not(Nation::isIsland)) //섬이 아닌 나라
        .collect(Collectors.toCollection(HashSet<Nation>::new));
    set.forEach(x -> System.out.println(x.getName() + " : " + x.getPopulation()));
  }
}
