package inherit;

public class InstanceOfDemo {
  public static void main(String[] args) {
    Person p = new Person();
    Worker w = new Worker();
    Student s = new Student();

    System.out.println(p instanceof Person);
    System.out.println(w instanceof Worker);
    System.out.println(s instanceof Student);

    //System.out.println(S instanceof Person);
    //System.out.println(W instanceof Person);
  }
}
