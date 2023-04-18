package testTest;

public class CarTest {
  public static void main(String[] args) {
    Car c1 = new Car("S23", "blue", 100);
    Car c2 = new Car("E255", "red", 50);
    int n = Car.number;
    System.out.println(c1.getSpeed());
  }
}
