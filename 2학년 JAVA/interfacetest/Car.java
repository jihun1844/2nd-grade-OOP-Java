package interfacetest;

public class Car implements Comparable {
  private String brand;
  private String model;
  private int speed;
  private int price;

  public Car(String b, String m, int s, int p) {
    brand = b;
    model = m;
    speed = s;
    price = p;
  }

  public Car() {
    // this.speed = 0;
    // this.price = 0;
    // this.brand = "Unknown";
    // this.model = "Unknown";
    this("Unknown", "Unknown", 0, 0);
  }

  public String toString() {
    return "브랜드 : " + brand + "모델 : " + model + "speed : " + speed + "price : " + price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  // public int compareTo(Comparable c) {
  //   if (this.price > ((Car) c).price) {
  //     return 1;
  //   } else if (this.price == ((Car) c).price) {
  //     return 0;
  //   }
  //   return -1;
  // }
  public int compareTo(Comparable obj) {
   
    //차의 가격 비교를 하려면, Car클래스의 getPrice를 호출해야 하니 
    //Comparable 타입으로 받은 인자를 Car타입으로 하향 형변환
    //물론 이 obj 객체는 Car 클래스 타입의 객체여야만 하고 그렇다고 가정한다
    Car aCar = (Car) obj;
    if (price > aCar.price) {
      return 1;
    } else if (price < aCar.price) {
      return -1;
    }
    return 0;
  }
}
