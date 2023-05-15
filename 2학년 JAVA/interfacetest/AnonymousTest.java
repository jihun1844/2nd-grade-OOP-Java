package interfacetest;

public class AnonymousTest {
  public static void main(String[] args) {
    RemoteControl rt1 = new SamsungTv();
    rt1.turnOff();

    RemoteControl rt2 = new LgTv();
    rt2.turnOn();

    RemoteControl rt3 = new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("Sony Tv 를 킵니다");
      }

      @Override
      public void turnOff() {
        System.out.println("Sony Tv 를 끕니다");
      }

    };
    rt3.turnOff();

    //무명 클래스를 만들떄(아래 부모클래스이름은 인터페이스 이름을 포함한 용어)
    //new 부모클래스이름(부모클래스의 생성자에게 전달할 인자 리스트) {클래스 정의}
    //무명 클래스를 만들때는 제약이 있는데, 새로운 생성자를 정의 할수 없다
    //class GradStudent extends Student {public}

    Student st1 = new Student("지훈", "컴정") {
      //무명 클래스는 생성자를 정의 할수 없다 (클래스의 이름이 없어서)
      //왜? 생성자는 클래스 이름과 같아야 하는데, 무명 클래스는 클래스 이름이 없다
      //그렇다고 부모 클래스 이름으로 생성자를 만들수도 없다
      @Override
      public String toString() {
        return "이름" + super.getName();
      }
    };
    System.out.println(st1);
    System.out.println("학생의 이름:" + st1.getName());
  }
}
