package default_package;

import java.util.Objects;

public class EX2 {
  public static void main(String[] args) {
    System.out.println(new Students("김삿갓"));
    System.out.println(new Students("홍길동"));
  }
}
class Students{
  String name;

  public Students(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if(o == null || getClass() != o.getClass()) return false;
    Students s = (Students) o;
    return this.hashCode() == s.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "학생[" + name + ']';
  }
}
