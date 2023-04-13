package ObjectClass;

public class Car {
  String brand;
  String model;

  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public Car() { //인자를 받고 this.변수를 지정하는 생성자가 있어서 this()가 가능함
    this("Unknown", "Unknown");
  }

  public String toString() {
    return brand + model;
  }

  //오버로딩 + 새로운 equals를 만듯것
  public boolean equals(Car car) {
    System.out.println("1번");
    return this.brand.equals(car.brand) && this.model.equals(car.model);
  }
  
  //Object 타입으로 한 이유는 다른 클레스 타입이 들어와도 다 수용 할려고
  public boolean equals(Object car) {
    if (car == null) 
      return false;

    //car가 Car클래스의 인스턴스가 아니면 바로 false를 반환하자
    //자바에는 이 목적으로 사용할수있는 연산자가 있다(+ - * / ...)instanceof 가 있다
    if (car instanceof Car == false)
      return false;


    //car 는 Car클래스의 객체라 가정한다
    //그래야 Car 클래스의 인스턴스의 brand, model 멤버에 접근 가능
    //하향 형변환
    Car youCar = (Car) car;
    System.out.println("2번");
    if (youCar.brand.equals(brand) && youCar.model.equals(model)) {
      return true;
    }
    return false;
  }
}
