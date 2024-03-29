class Television {
  int channel;
  int volume;
  boolean isOn;

  //메소드 선언 (리턴값은 없음)
  void print() {
    System.out.println("채널은  " + channel + "  불륨은  " + volume);
  }

  int getChannel(){
    return channel;
  }

  void setChannel(int ch) {
    channel = ch;
  }
}

public class TelevisionTest {

  public static void main(StringTest[] args) {
    Television myTv = new Television();
    myTv.channel = 7;
    myTv.volume = 4;
    myTv.isOn = true;
    //메소드 호출방법 : 해당 클레스의 참조변수.메소드명();
    myTv.print();

    Television yourTv = new Television();
    yourTv.channel = 58;
    yourTv.volume = 36;
    yourTv.isOn = true;
    yourTv.print();

    myTv.setChannel(11);
    int ch = myTv.getChannel();
    System.out.println("현재 채널은 "+ ch + "입니다");
  }
}