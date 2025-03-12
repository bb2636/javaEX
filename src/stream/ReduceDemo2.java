package stream;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ReduceDemo2 {
  public static void main(String[] args) {
    Stream<Nation> nation1 = Nation.nations.stream();
    nation1.reduce((n1, n2)->
        n1.getPopulation() > n2.getPopulation() ? n1 : n2)
        .ifPresent(Util::printWithParenthesis);

    Stream<Nation> nation2 = Nation.nations.stream();
    double reduce = nation2.filter(n -> n.getGdpRank() <= 20)
        .mapToDouble(m -> m.getPopulation())
        .reduce(0.0, (p1, p2) -> p1 + p2);
    System.out.println("리스트에서 gdp 20위 이내인 나라의 인구 총합 : " + reduce);

    Stream<Nation> nation3 = Nation.nations.stream();
    DoubleStream doubleStream = nation3.mapToDouble(Nation::getPopulation);
    DoubleSummaryStatistics doubleSummaryStatistics = doubleStream.summaryStatistics();
    System.out.println(doubleSummaryStatistics);
  }
}
