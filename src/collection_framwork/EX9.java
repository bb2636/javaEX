package collection_framwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EX9 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null;
    int maxScore = 0;
    int totalScore = 0;

    Set<String> keyset = map.keySet();
    Iterator<String> iterator = keyset.iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      int value = map.get(key);
      totalScore += value;
      maxScore = Math.max(maxScore, value);
      name = (maxScore <= map.get(key)) ? key : name;
    }

    System.out.println("평균 점수 : " + totalScore / map.size());
    System.out.println("최고 점수 : " + maxScore);
    System.out.println("최고 점수를 받은 아이디 : " + name);
    System.out.println();

    //entryset 활용
//    name = null;
//    maxScore = 0;
//    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//    Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
//    while (iterator1.hasNext()) {
//      Map.Entry<String, Integer> entry = iterator1.next();
//      String key = entry.getKey();
//      int value = entry.getValue();
//      totalScore += value;
//      maxScore = Math.max(maxScore, value);
//      name = (maxScore <= value) ? key : name;
//    }
//    System.out.println("평균 점수 : " + totalScore / map.size());
//    System.out.println("최고 점수 : " + maxScore);
//    System.out.println("최고 점수를 받은 아이디 : " + name);
//  }
  }
}
