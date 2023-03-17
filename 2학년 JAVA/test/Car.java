package test;

public class Car {
  private int speed;
  private String name;

  public Car() { 
    System.out.println("속도는" + speed);
  }

  //인스턴스 초기화 블럭(instance initialization block)
  //생성자가 오버로딩 되도 공통적으로 전부 카피함
  {
    speed = 100; //자동으로 생성자를 카피함
  }

  public Car(String name) {
    this.name = name;
    System.out.println("속도는 " + speed);
  }

  public static void main(String[] args) {
    Car c = new Car(); //생성자가 호출됨
    Car c2 = new Car("그랜져");

  }
}
