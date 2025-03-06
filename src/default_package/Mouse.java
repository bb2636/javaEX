package default_package;

public class Mouse {
  String name;

  public Mouse(String name) {
    this.name = name;
  }
  public boolean equals(Object obj) {
    if(obj instanceof Mouse) {
      Mouse m = (Mouse) obj;
      if(name.equals(m.name)) return true;
    }
    return false;
  }
  @Override
  public String toString() {
    return "Mouse{" +
        "name='" + name + '\'' +
        '}';
  }
}
