package interfacetest;
//인터페이스의 모든 메소드는 public abstract 이다
public interface RemoteControl {
  void turnOn();

  void turnOff();

  //디폴트 메소드
  // default void volumeControl(int amount) {
  //   String st = "null";
  //   st = amount > 0 ? "높입니다" : "낮춥니다";
  //   amount = Math.abs(amount); //  |number|
  //   System.out.println("불륨을 "+ amount +"만큼 " + st );
  // };
  
}
