package exception_handle;

public class GenericMethodDemo2 {
  public static void main(String[] args) {
    Ticket[] tickets = new Ticket[3];
    tickets[0] = new Ticket(10000);
    tickets[1] = new Ticket(20000);
    tickets[2] = new Ticket(15000);
    //countGT(tickets,tickets[2]);

  }
  static <T extends Comparable> int countGT(T[] array, T[] element) {
    int count = 0;
    for(T t : array) {
      if(t.compareTo(element) > 0) {
        count++;
      }
    }
    return count;
  }
}
class Ticket implements Comparable{
  int price;

  public Ticket(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Ticket t) {
      if(this.price>t.price) return 1;
      else if (this.price<t.price) return -1;
    }
    return 0;
  }
}
