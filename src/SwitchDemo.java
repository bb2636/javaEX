public class SwitchDemo {
  public static void main(String[] args) {
    whoIsIt("호랑이");
    whoIsIt("참새");
    whoIsIt("고등어");
    whoIsIt("곰팡이");
  }
  static void whoIsIt(String animal){
    String kind = "";
      switch (animal) {
        case "호랑이" :
          kind = "포유류";
          break;
        case "참새" :
          kind = "조류";
          break;
        case "고등어" :
          kind = "어류";
          break;
        default:
          kind = "분류할 수 없음";
      }
      System.out.printf("%s 는 %s 입니다 \n", animal, kind);
    }
}
