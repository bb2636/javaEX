package chapter4_object;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello() {
    System.out.printf("이름은 %s 이고 나이는 %d 입니다", name, age);
  }
}
