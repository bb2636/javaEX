package stream;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
  public static void main(String[] args) {
    Stream<Nation> s1 = Nation.nations.stream();
    Double avg = s1.collect(Collectors.averagingDouble(Nation::getPopulation));
    System.out.println("인구의 평균값 : " + avg);

    Stream<Nation> s2 = Nation.nations.stream();
    Long count = s2.collect(Collectors.counting());
    System.out.println("나라 개수 : " + count);

    Stream<Nation> s3 = Nation.nations.stream();
    //4개만 꺼내 이름만 가지고 stream반환
    String names = s3.limit(4)
        .map(Nation::getName)
        .collect(Collectors.joining("-"));
    System.out.println("4개의 나라 : " + names);

    Stream<Nation> s4 = Nation.nations.stream();
    String names2 = s4.limit(4)
        //이름을 기준으로 매핑, stream 반환
        .collect(Collectors.mapping(Nation::getName, Collectors.joining("-")));
    System.out.println("4개의 나라 (map+collect 동시 적용) : " + names2);

    Stream<Nation> s5 = Nation.nations.stream();
    Optional<Double> collect = s5.collect(Collectors.mapping(
        Nation::getPopulation, Collectors.maxBy(Double::compare)));
    System.out.println("최대인구를 가진 나라의 인구수 : "+ collect.get());

    Stream<Nation> s6 = Nation.nations.stream();
    IntSummaryStatistics iss = s6.collect(Collectors.summarizingInt(n -> n.getGdpRank()));
    System.out.println(iss);
  }
}
