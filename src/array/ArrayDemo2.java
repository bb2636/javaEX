package array;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    //배열 초기화
    int[] scores = {90,80, 95, 85,70,10,20,100, 30,50,50,60};
    int[] scores1 = new int[]{1,2,3,4,5};
    int[] scores2;
      scores2 = new int[]{1,2,3,4,5};

    System.out.println("scores[10] = " + scores[10]); //50
    System.out.println("scores[last] = " + scores[scores.length -1] ); //60

    for (int i = 0; i < scores.length; i++) {
      if(scores[i] == 100) {
        System.out.printf("%d 번째 \n", i+1); //8번째
        break;
      }
    }

//    for (int i = 0; i < scores.length; i++) {
//      System.out.print(scores[i] + ",");
//    }
    System.out.println(Arrays.toString(scores));

    char[] chas = {'a', 'b', 'c'};
    System.out.println(Arrays.toString(chas));
  }
}
