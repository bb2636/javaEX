package collection_framwork;

import java.util.HashSet;
import java.util.Set;

public class EX2 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));

      for (Person person : set) {
        System.out.print(person);
      }
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person[" + name + " : " + age + "] ";
  }

  @Override
  public int hashCode() {
    return (name+age).hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Person)) return false;
    Person p = (Person) obj;
    return this.name.equals(p.name) && this.age == p.age;
  }
}