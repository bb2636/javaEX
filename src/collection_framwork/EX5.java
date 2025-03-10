package collection_framwork;

import java.util.HashMap;
import java.util.Map;

public class EX5 {
  public static void main(String[] args) {
    Map<String, String> map1 = Map.of("호랑이","tiger","표범","reopard","사자","lion");
    Map<String, String> map2 = new HashMap<>(map1);
    //hash map 으로 변경

    System.out.println("변경 전" + map2);
    map2.replaceAll((k,v) -> v.toUpperCase());
    System.out.println("변경 후" +map2);
  }
}
