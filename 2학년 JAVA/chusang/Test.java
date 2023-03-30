package chusang;

public class Test {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Circle c = new Circle();
    Triangle t = new Triangle();

    r.draw();
    r.move(12, 54); //부모에서 상속받은 메소드니 사용 가능

    c.draw();
    t.draw();
  }
}
