package enumtype;

public class PeopleDemo {
  public static void main(String[] args) {
    //System.out.println(People.Gender.FEMAIL);
    Person person = new Person();
    person.name = "홍길동";
    person.age = 20;
    person.gender = Gender.MAIL;

    if(person.gender == Gender.FEMAIL) {
      System.out.println("여성");
    } else {
      System.out.println("남성");
      System.out.println(person.gender);
    }
  }
}
