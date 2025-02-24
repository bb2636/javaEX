public class StringDemo {
  public static void main(String[] args) {
    Cat c1 = new Cat("나비");
    Cat c2 = c1;

    System.out.println(c1.getName());
    System.out.println(c2.getName());
    c2.setName("야옹");
    System.out.println(c1.getName());
    System.out.println(c2.getName());
  }

  static class Cat {
    private String name;

    public Cat(String name) {
      this.name = name;
    }
    public String getName() {
      return name;
    }

    public void setName (String name){
      this.name = name;
    }
  }
}
