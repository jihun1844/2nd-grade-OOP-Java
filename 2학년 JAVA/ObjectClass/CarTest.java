package ObjectClass;



public class CarTest {
  public static void main(String[] args) {
    // Car car = new Car();
    // Class classvar = car.getClass();
    // System.out.println(classvar.getName()); //출력 : ObjectClass.Car 여기서 ObjectClass는 패키지 명
    // System.out.println("브렌드는 "+car.brand + ", 모델 "+ car.model );


    Car car1 = new Car("현대", "그렌저");
    Car car2 = new Car("현대", "그렌저");
    //참조변수끼리 equals()비교를 하면 주소값을 비교함
    System.out.println(car1.equals(car2)); //equals()= 값을 비교하는 함수

    Car car3; //Null값이 들어가있음
    //에러가 나는 이유는 메소드가 실행될때 car3. 이 찍힐때 애러가 남
    //System.out.println(car1.equals(car3));  // 

  }
}
