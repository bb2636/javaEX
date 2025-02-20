public class AddDemo {
  public static void main(String[] args) {
    int j = 0;
    int i = 2;
    System.out.println("연산전 : " + j );
    //j = ++i;  >>2
    j = i++; //참조 후 더하기 때문에 결과값에 1이 더해지지 않음
    System.out.println("연산후 : " + j); //1

    //조건식? 연산1 : 연산2
    boolean res = (j==1) ? true : false;
    System.out.println(res);
  }
}
