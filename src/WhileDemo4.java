import java.util.Scanner;

public class WhileDemo4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("동물이름을 입력하세요 (종료하려면 stop 입력) : ");
    String animal = in.nextLine();

    while (true) {
      if (animal.equalsIgnoreCase("stop")) {
        break;
      }
      whoIsIt(animal);
      System.out.print("동물이름을 입력하세요 (종료하려면 stop 입력) : ");
      animal = in.nextLine();
    }
  }

    private static void whoIsIt(String animal) {
      String kind = switch (animal) {
        case "호랑이" -> "포유류";
        case "참새" -> "조류";
        case "고등어" -> "어류";
        default -> "분류할 수 없음";
      };
      System.out.printf("%s 는 %s 입니다 \n", animal, kind);
    }
  }//end of method

