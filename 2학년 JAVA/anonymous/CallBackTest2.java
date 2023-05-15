package anonymous;

import interfacetest.RemoteControl;

public class CallBackTest2 {
  public void remoteControl(RemoteControl rc) {
    rc.turnOn();
    System.out.println("리모트컨트롤 메소드 호출");
  }

  public static void main(String[] args) {
    CallBackTest2 cd = new CallBackTest2();
    //무명 클래스로 RemoteControl 객체를 인자로 전달 하시오
    //1. 변수사용해서 전달
    //2. 변수 사용 하지 않고 전달 
    //화면에는 파나소닉 TV가 켜졌습니다


    // PanasonicTv tv = new PanasonicTv();
    // cb.remoteControl(tv);

    cd.remoteControl(new PanasonicTv());

    cd.remoteControl(new RemoteControl() {
      public void turnOn() {
        System.out.println("no 브랜드 끔");
      }

      public void turnOff() {
        System.out.println("no 브랜드 킴");
      }
    });

  }
}



class PanasonicTv implements RemoteControl {
  @Override
  public void turnOff() {
    System.out.println("파나소니 꺼짐");

  }
  @Override
  public void turnOn() {
    System.out.println("파나소니 켜짐");

    
  }
}
