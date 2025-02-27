package inherit;

public class PersonDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = s;
    p.whoami();

    Student s1 = (Student) p;
    System.out.println(s1.name);
    s1.whoami();
    s1.work();

    Person[] persons = new Student[3];
    persons[0] = new Student();
    persons[1] = new Worker();
    persons[2] = new Person();
  }
  static void method1(Student s) {
    s.work();
  }
  static void method2(Worker w) {
    w.work();
  }
  static void methodAll(Person p) {

  }
}
