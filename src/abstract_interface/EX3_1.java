package abstract_interface;

public class EX3_1 {
  public static void main(String[] args) {
    Line l1 = new Line(20);
    Concrete l2 = new Concrete(100,50);
    int res = l1.compareTo(l2);
    if(res == -999){
      System.out.println("비교할 수 없습니다.");
    } else {
      if(res == 0) {
        System.out.println("두 라인의 길이가 같습니다.");
      } else if(res > 0) {
        System.out.println(l1 + " 라인이 " + l2 + " 라인보다 깁니다.");
      } else if(res < 0) {
        System.out.println(l2 + " 라인이 " + l1 + " 라인보다 깁니다.");
      }
    }
  }
}

class Line implements Comparable{
  int length;

  public Line(int length) {
    this.length = length;
  }
  @Override
  public int compareTo(Object o) {
    if(o instanceof Line) {
      Line l = (Line)o;
      if(this.length - l.length == 0){
        return 0;
      } else if (this.length - l.length > 0) {
        return 1;
      } else {
        return -1;
      }
    }
    return -999;
  }

  @Override
  public String toString() {
    return "Line[" +
        "length=" + length +
        ']';
  }
}
