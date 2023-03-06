public class CarTest {
  public static void main(String[] args) {
    Car myCar = new Car(); //Car 클레스의 객체 생성
    myCar.changeGear(1); //Car 클레스의 메소드 호출
    myCar.speedUp();        //Car 클레스의 메소드 호출
    System.out.println(myCar); //toString 호출
                               //Car 클레스가 퍼블릭이라서 가능
  }
}
