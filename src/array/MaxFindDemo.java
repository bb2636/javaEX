package array;

import java.util.Arrays;

public class MaxFindDemo {
  public static void main(String[] args) {
    int[] value = {4,1,9,2,7};
    int max = value[0];
    int min = value[0];

    for (int i = 1; i < value.length; i++) {
      if(max < value[i]) {
        max = value[i];
      } else if( min > value[i]) {
        min = value[i];
      }
    }
    System.out.println("max = " + max);
    System.out.println("min = " + min);

    System.out.println("before =" + Arrays.toString(value));
    Arrays.sort(value); //크기순으로 정렬하기
    System.out.println("after =" + Arrays.toString(value));
    System.out.println("max = " + value[value.length-1]);
    System.out.println("min = " + value[0]);
  }
}
