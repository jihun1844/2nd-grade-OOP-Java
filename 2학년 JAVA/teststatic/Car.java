package teststatic;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Car {
  private String model;
  private String color;
  private int speed;

  // 상수란? : 한번 초기화 되면 절대 값을 변경할수 없는 값
  //자바에서는 final keyword를 사용
  //자바에서 상수는 static으로 만드는것이 바람직
  //상수는 대문자로 사용하는것이 국룰
  //상수는 일반적으로 public으로 선언한다
  public static final int MAX_SPEED;

  //
  static {
    MAX_SPEED = 350;
  }


  {
    model = "그랜저";
    color = "흰색";
  }



  private int id;
  // 정적 맴버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자 (static)
  private int number = 0;

 

  Car(String argModel, String argColor, int argSpeed) {
    id = ++number;
    model = argModel;
    color = argColor;
    speed = argSpeed;
    
  }

  public static void main(String[] args) {
    Car c1, c2, c3;
    c1 = new Car("s600", "white", 80);
    c2 = new Car("E500", "blue", 20);
    c3 = new Car("E300", "gray", 160);

    System.out.println("생성된 자동차 수 : " + c1.number);
    System.out.println("생성된 자동차 수 : " + c2.number);
    System.out.println("생성된 자동차 수 : " + c3.number);

    //자바의 수확관련 라이브러리 클래스는 정적 메서드를 이용
    double d = Math.sqrt(9);
    System.out.println("9의 제곱근 : " + d);


  // speed도 static으로 해두면 클래스로 부를수 있음
  // public static int getNumber() {
  //   return number;
  // }

  //스태틱 메서드는 인스턴스 메소드를 호출할수 없다
  //인스턴스 메서드는 인스턴스가 생성되어야만 호출할수 있다
  }
}