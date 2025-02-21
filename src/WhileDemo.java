public class WhileDemo {
  public static void main(String[] args) {
    int count = 0;
    while (true){
      if(count <= 2) {
        System.out.println("hello");
      } else{
        break;
      }
      count++;
    }

    count = 0;
    while (count<=2) {
      System.out.println("hello");
      count++;
    }
  }
}
