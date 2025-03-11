package stream;

import java.util.List;
import java.util.stream.Stream;

public class EX1 {
  public static void main(String[] args) {
    Stream.of("a1","a2","a3")
        .map(s -> s.substring(1)) //stream string으로 map
        .mapToInt(Integer::parseInt)//문자열을 숫자로 변환
        .max()//최대값 찾아서 optional로 변환
        .ifPresent(System.out::println); //최대값 존재 시 해당 값 출력


    List<String> list1 = List.of("갈매기","라마","다람쥐","나비");
    list1.stream().filter(s->s.length() ==2)
       .forEach(System.out::println);

    List<String> list2 = List.of("서울","워싱턴","베이징","파리","마드리드","런던");
    System.out.println(list2.stream().sorted().findFirst().get()) ;
    //sorted -오름차순 정렬
    //첫번째 출력 - findfirst().get()
  }
}
