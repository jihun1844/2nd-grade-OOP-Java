package anonymous;
import java.util.Scanner;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


interface Beep {
  void say();
}


public class CallBackTest {
  public static void main(String[] args) {
    // javax.swing.Timer 클래스의 객체를 생성하기 위해서는
    // int 타입의 delay, import java.awt.event.ActionListener; 인터페이스 타입의 객체를 넘겨줘야함
    // 두번째 인자인 객체를 넘겨주기 위해서는 아래의 두가지 방법중 하나를 사용
    //1. 저 인터페이스를 구현하는 클래스를 정의하고, 그 클래스의 객체를 생성해 넘겨준다
    //2. 저 인터페이스를 구현하는 클래스를 무명 클래스로 정의 한다
    //   무명 클래스 클래스 정의와 생성이 하나의 문장으로 해결 되는것


    //무명클래스로 하는방법
    ActionListener A = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("beep from 무명클래스");
      }

    };
    // Timer timer = new Timer(1000, A); //ActionListener 타입의 객체만 들어갈수있음
    // timer.start();

//----------위는 무명클래스 객체를 찍는것 아래는 Timer 선언자체에 무명클래스 넣어버림-------

    Timer timer = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("beep 무명클래스");
      }
    });
     timer.start();


    Scanner scn = new Scanner(System.in);
    System.out.println("enter");
    scn.nextLine();
    scn.close();
    System.out.println("프로그램 종료");
  }
}

class TestBeep implements Beep {

  @Override
  public void say() {
    System.out.println("beep");
  }
  
}
