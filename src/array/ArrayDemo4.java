package array;

public class ArrayDemo4 {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "kim";
    for (int i = 0; i < names.length; i++) {
      if( names[i] != null && names[i].length() > 0) {
        //쇼트서킷 - 앞이 false 이기 때문에 뒤에 조건은 실행 안함
        System.out.println(names[i].length());
      }
    } //3 > kim
    names[1] = "lee";
    for (int i = 0; i < names.length; i++) {
      if(names[i] != null && names[i].length() > 0) {
        System.out.println(names[i].length());
      }
    } //3 3 3 > kim / kim lee
    names[2] = "park";
    for (String name : names) {
      if (name != null && !name.isEmpty()) {
        System.out.println(name.length());
      }
    }// 3 3 3 3 3 4 > kim / kim lee / kim lee park
  }
}
