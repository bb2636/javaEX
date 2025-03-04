package abstract_interface;

public class EX3_2 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10, 5);
    Triangle t2 = new Triangle(5, 10);

    int res = t1.compareTo(t2);
    if(res == -999) {
      System.out.println("비교 불가");
    } else if (res > 0) {
      System.out.println("t1이 더 큼");
    } else if(res < 0) {
      System.out.println("t2가 더 큼");
    } else {
      System.out.println("둘이 같음");
    }
  }
}
class Triangle implements Comparable{
  int height;
  int width;

  public Triangle(int height, int width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public int compareTo(Object o) {
    int result = -999;
    if(o instanceof Triangle t) {
      if (this.getArea() > t.getArea() ) result =  1;
      else if (this.getArea() < t.getArea()) result = -1;
      else result = 0;
    }
    return result;
  }

  private double getArea() {
    return (double) (height * width) / 2;
  }

  @Override
  public String toString() {
    return "삼각형 [" +
        "width =" + width +
        ", height =" + height +
        ", 넓이 = " + getArea() +
        ']';
  }
}
