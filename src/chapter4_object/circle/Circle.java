package chapter4_object.circle;

class Circle {
  double radius;
  String color;
  static int numOfCircle;
  public Circle() {
    this(10.0, "빨강");
  }
  public Circle(double radius) {
    this(radius, "빨강");
  }
  public Circle(String color) {
    this(10.0, color);
  }
  public Circle(double radius, String color){
    if(radius <= 0) {
      this.radius = 10.0;
    } else {
      this.radius = radius;
    }
    if(color != null && color.length() > 0) {
      this.color = color;
    } else {
      this.color = "빨강";
    }
  }
}

