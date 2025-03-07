package abstract_interface;

import java.util.Arrays;
import java.util.Comparator;

public class EX3_3 {
  public static void main(String[] args) {
    Book b1 = new Book(15000);
    Book b2 = new Book(50000);
    Book b3 = new Book(20000);

    int res = b1.compareTo(b2);
    if (res == -999) {
      System.out.println("비교 불가");
    } else {
      if (res > 0){
        System.out.println(b1+"이 " +b2+" 보다 비쌈");
      } else if (res < 0) {
        System.out.println(b1+"이 "+b2+" 보다 쌈");
      } else {
        System.out.println("가격 같음");
      }
    }

    Book[] books = {
        new Book(15000),
    new Book(30000),
    new Book(20000)
    };
    Arrays.sort(books, ((o1, o2) -> o2.compareTo(o1)));
    for (Book book : books) {
      System.out.println(book);
    }
  }
}
class Book implements Comparable {
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object o) {
    int result = -999;
    if(o instanceof Book b) {
      if(this.price > b.price) result =  1;
      else if(this.price < b.price) result =-1;
      else result = 0;
    }
    return result;
  }

  @Override
  public String toString() {
    return "Book[" +
        "price=" + price +
        ']';
  }
}
