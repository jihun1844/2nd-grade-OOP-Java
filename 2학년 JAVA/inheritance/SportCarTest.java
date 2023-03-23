package inheritance;

public class SportCarTest {
  public static void main(String[] args) {
    SportCar sc = new SportCar();

    sc.speed = 100; //speed는 Car클래스에 있지만 SportCar랑 상속이므로 사용가능
    
    sc.setSpeed(60);
    sc.setTurbo(true);

    System.out.println("speed["+ sc.getSpeed()+ "], turbo["+ sc.isTurbo()+ "]");
  }
}
