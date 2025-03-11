package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    //알파벳 순서대로 정렬
    List<String> list1 = List.of("a1","c2","d3","b2","a4");
    list1.stream().sorted().forEach(Util::print);

    System.out.println();

    List<Integer> list2 = List.of(7,10,4,8,3,2);
    list2.stream().sorted().forEach(Util::print);

    System.out.println();
    //나라 이름을 사전순으로 정렬
    List<Nation> list3 = Nation.nations;
    Stream<Nation> sorted = list3.stream().sorted(Comparator.comparing(Nation::getName));
    sorted.forEach(Util::printWithParenthesis);

    System.out.println();
    //gdp 랭크에 따라 정렬
    list3.stream()
        .sorted(Comparator.comparing(Nation::getGdpRank))
        .forEach(nation -> Util.printWithParenthesis(nation.getName() + ":" + nation.getGdpRank() ));

    System.out.println();
    //인구수에 따라 정렬
    list3.stream()
        .sorted(Comparator.comparing(Nation::getPopulation))
        .forEach(nation -> Util.printWithParenthesis(nation.getName() + " : " + nation.getPopulation()));

    System.out.println();
    //인구순에 따라 내림차순 정렬
    List<Nation> list4 = Nation.nations;
    Stream<Nation> stream = list4.stream();
    stream
        .sorted(Comparator.comparing(Nation::getPopulation).reversed())
        .forEach(nation -> Util.printWithParenthesis(nation.getName() +" : " + nation.getPopulation()));
  }
}
