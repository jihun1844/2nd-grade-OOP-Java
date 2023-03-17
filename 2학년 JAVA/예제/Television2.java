public class Television2 {
  private int channel;
  private int volume;
  private boolean onOff;

  //생성자 : 인수로 받은 값을 매개변수에 넣어준다 (초기화 해준다)
  Television2(int c, int v, boolean o) {
    channel = c;
    volume = v;
    onOff = o;
  }
  void print() {
    System.out.println("채널은" + channel + "이고 불륨은 " + volume + "입니다");
  }
}
