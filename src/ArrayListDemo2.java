import java.util.ArrayList;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("kim");
    names.add("lee");
    names.add("park");

    System.out.println(names);
    System.out.println(names.size());
    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      if(4 == name.length()) {
        System.out.println("삭제할 원소 : " + names.get(i));
        names.remove(i);
      } else {
        System.out.println(names.get(i));
      }
    }
    System.out.println(names);
    System.out.println(names.size());
  }
}
