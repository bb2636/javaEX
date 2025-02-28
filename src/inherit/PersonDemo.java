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

    Student st = (Student) persons[0];
    st.work();

    Worker wk = (Worker) persons[1];
    wk.work();

    persons[2].whoami(); //자기꺼라 형변환 안해도 됨

    System.out.println("다형성과 메서드 매개변수");
    Person p1 = new Person();
    methodAll(p1);
    Student s2 = new Student();
    methodAll(s2);
    Worker w2 = new Worker();
    methodAll(w2);

  }
  static void method1(Student s) {
    s.work();
  }
  static void method2(Worker w) {
    w.work();
  }
  static void methodAll(Person p) {
    p.whoami();
    if(p instanceof Student) {
      Student s = (Student) p;
      s.work();
    } else if (p instanceof Worker){
      Worker w = (Worker) p;
      w.work();
    }
  }
}
