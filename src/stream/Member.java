package stream;

public class Member {
  private String name;
  private static int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public static int getAge() {
    return age;
  }

}
