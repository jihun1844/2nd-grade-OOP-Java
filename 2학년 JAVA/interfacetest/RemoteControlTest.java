package interfacetest;

public class RemoteControlTest {
  public static void main(String[] args) {
    // RemoteControl rm = new SamsungTv();
    // rm.turnOn();
    // rm.volumeControl(-4);
    // rm = new LgTv();
    // rm.turnOn();

    // rm.volumeControl(3);

    RemoteControl rm = new SamsungTv();
    turnOnAndControlVolume(rm, 3);

    rm = new LgTv();
    turnOnAndControlVolume(rm, -2);

  }

  public static void turnOnAndControlVolume(RemoteControl rm, int vol) {
    rm.turnOn();
    if (rm instanceof AdvancedRemoteControl) {
      ((AdvancedRemoteControl)rm).volumeControl(vol);
    } else {
      System.out.println("이 기기는 원격 제어를 지원 안함");
    }
  }
}
