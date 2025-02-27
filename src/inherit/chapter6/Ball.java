package inherit.chapter6;

import javax.swing.plaf.PanelUI;

public class Ball extends Circle{
  private String color;

  public Ball(String color) {
    this.color = color;
  }
  public String findColor() {
    return color;
  }
  public void findVolume() {
    System.out.println("부피 = " + 3 / (double) 4 * (Math.PI * radius * radius * radius));
  }

  @Override
  public void findArea() {
    super.findArea();
    System.out.println("구의 넓이는 " + 4 * Math.PI * radius * radius);
  }
}
