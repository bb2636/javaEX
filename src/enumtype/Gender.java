package enumtype;

public enum Gender {
  MAIL("남성"), FEMAIL("여성");

  //생성자
  Gender(String name) {
    this.name = name;
  }
  //필드
  private String name;
  //메서드
  public String toString() {
    return name;
  }
}
