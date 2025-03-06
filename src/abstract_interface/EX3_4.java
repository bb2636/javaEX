package abstract_interface;

import java.util.Arrays;

public class EX3_4 {
  public static void main(String[] args) {
    Person p1 = new Person("박지성", 40, 175, 68);
    Person p2 = new Person("손흥민", 20, 180, 70);

    int res = p1.compareTo(p2);
    if (res == -999) {
      System.out.println("비교 불가");
    } else {
      if (res > 0) {
        System.out.println(p1.name + "이 연장자");
      } else if (res < 0) {
        System.out.println(p2.name + "이 연장자");
      } else {
        System.out.println("동갑");
      }
    }
    Person[] persons = {
        new Person("박지성", 40, 175, 68),
        new Person("손흥민", 20, 180, 70),
        new Person("홍길동",32,170,75)
    };
    Arrays.sort(persons);
    for (Person person : persons) {
      System.out.println(person);
    }
  }
}
class Person implements Comparable{
  String name;
  int age;
  int height;
  int weight;

  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public int compareTo(Object o) {
    int result =  -999;
    if (o instanceof Person p) {
      if(this.age > p.age) result = -1;
      else if(this.age < p.age) result = 1;
      else result = 0;
    }
    return result;
  }

  @Override
  public String toString() {
    return "Person[" +
        "이름=\"" + name + '\"' +
        ", 나이=" + age +
        ", 키=" + height +
        ", 몸무게=" + weight +
        ']';
  }
}
