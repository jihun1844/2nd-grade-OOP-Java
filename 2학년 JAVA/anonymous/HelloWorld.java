package anonymous;

public class HelloWorld {
  public void sayHello() {
    // Hello World를 인사를 영어로, 프랑스어로, 스페인어로 출력한다
    //영어로 인사 할때는 Hello 인터페이스를 구현하는 클래스 EnglishGreeting을
    //정의하고, 그 객체를 생성해서 인사
    // 프랑스어와 스페인어로 인사할때는 무명 클래스로 객체를 생성해서 인사
    Hello engHello = new EnglishGreeting();
    engHello.greetSomeone("world");

    Hello frenchHello = new Hello() {
      @Override
      public void greetSomeone(String someone) {
        System.out.println("Salut tout le monde " + someone);
      }
    };
    frenchHello.greetSomeone("Fred");

    Hello spanHello = null;

    spanHello = new Hello() {
      @Override
      public void greetSomeone(String someone) {
        System.out.println("대충  홀라" + someone);
      }
    };

    spanHello.greetSomeone("mundo");
  }

  public static void main(String[] args) {
    HelloWorld hw = new HelloWorld();
    hw.sayHello();
  }
}

//------------------------------------------------

interface Hello {
  void greetSomeone(String someone);
}

//------------------------------------------------

class EnglishGreeting implements Hello {

  @Override
  public void greetSomeone(String someone) {
    System.out.println("Hello" + someone);    
  }
}