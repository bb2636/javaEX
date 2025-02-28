package inherit.ex;

public class EX5 {
  public void main(String[] args) {
    Phone[] phones = {
        new Phone("황진이"),
        new Telephone("길동이", "내일"),
        new Smartphone("민국이", "갤러그")
    };

    for (Phone phone : phones) {
      if (phone instanceof Smartphone sm) {
        sm.playGame();
      } else if (phone instanceof Telephone tel) {
        tel.autoAnswering();
      } else if (phone instanceof Phone) {
        phone.talk();
      }
    }
  }


  class Phone {
    protected String owner;

    public Phone(String owner) {
      this.owner = owner;
    }

    void talk() {
      System.out.println(owner + "는(은) 통화중입니다");
    }
  }

  class Telephone extends Phone {
    private String when;

    public Telephone(String when) {
      super(when);
      this.when = when;
    }

    public Telephone(String owner, String when) {
      super(owner);
      this.when = when;
    }

    void autoAnswering() {
      System.out.println(owner + "는 부재중이니 " + when + "에게 전화 요망");
    }
  }

  class Smartphone extends Phone {
    private String game;

    public Smartphone(String owner, String game) {
      super(owner);
      this.game = game;
    }

    public Smartphone(String owner, String when, String game) {
      super(owner);
      this.game = game;
    }

    void playGame() {
      System.out.println(owner + "는 " + game + " 중 입니다");
    }
  }
}

