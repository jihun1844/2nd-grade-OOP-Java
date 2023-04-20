package testTest;

public class Cat extends Animal{
  public static void eat() {
    System.out.println("Cat의 정적 메소드");
  }

  public void sound() {
    System.out.println("Cat의 인스턴스 메소드");
  }
  public static void main(String[] args) {
    Cat c = new Cat();
    Animal myA = c;
    //정적 메소드는 오버라이딩 해도 해당 클래스의 타입이면 그 클래스안의 정적 메소드를 부름
    Animal.eat();
    myA.sound();

  }
}
