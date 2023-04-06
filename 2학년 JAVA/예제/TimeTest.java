public class TimeTest {
  public static void main(String[] args) {
    Time time = new Time();
    System.out.println("기본 생성자 호출 " + time.toString());

    Time time2 = new Time(13, 26, 34);
    System.out.println("두번째 생성자 : " + time2.toString());
  }
}