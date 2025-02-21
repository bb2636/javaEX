public class MethodDemo {
  public static void main(String[] args) {
    int result = sum(1,10);
    System.out.println("1부터 10까지의 합은 : " + result);
    result = sum(10,100);
    System.out.println("10부터 100까지의 합은 : " + result);
    System.out.println("100부터 1000까지의 합은 : " + sum(100,1000));
  }//end of method

   static int sum(int num1, int num2) {
     int total = 0;
     for (int i = num1; i <= num2; i++) {
       total += i;
     }
    return total;
  }
}//end of class
