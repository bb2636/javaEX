package collection_framwork;

import java.util.ArrayList;
import java.util.List;

public class EX1 {
  public static void main(String[] args) {
    List<String> st = new ArrayList<>();
    st.add("갈매기");
    st.add("나비");
    st.add("다람쥐");
    st.add("라마");

    for (String s : st) {
      if(s.length() == 2) {
        System.out.println(s);
      }
    }
  }
}
