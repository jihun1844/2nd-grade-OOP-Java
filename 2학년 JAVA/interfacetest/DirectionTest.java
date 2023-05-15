package interfacetest;

public class DirectionTest implements Direction{
  public static void main(String[] args) {
    System.out.println("North:" + Direction.NORTH);
    System.out.println("South:" + Direction.SOUTH);
    //Direction.EAST = 100 //상수이기 떄문에 값을 경할수 없다

    //Direction 인터페이스를 구현 하면, 나의 상수인것 처럼 그냥 아래와 같이
    //사용할수 있다
    System.out.println("EAST: " + EAST);
  }
}
