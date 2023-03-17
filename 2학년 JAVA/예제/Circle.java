public class Circle {
  private Point p;
  private int radius;

  public Circle(Point p, int radius) {
    this.p = p;
    this.radius = radius;
  }

  public String toString() {
    return "기준점" + p + ", 반지름" + radius;
  }

  public static void main(String[] args) {
    Point p = new Point(10, 15);
    Circle c = new Circle(p, 10);

    System.out.println(p); //오브젝트(상위클래스)에 있는 toString을 부름 (오버라이딩을 안하면 toString메소드를 불러서 주소값을 출력) 
    System.out.println(c);
  }
}
