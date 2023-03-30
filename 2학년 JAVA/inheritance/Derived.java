package inheritance;

public class Derived extends Base {
  public Derived(String a) {
    //부모클래스의 생성자를 명시적으로 호출하지않으면
    //묵시적으로 호출됨 이 때 묵시적으로 호출되는 부모 클래스 생성자는
    //어떠한 인자도 가지지 않은 생성자. (디폴트 생성자)
    
    super("gg"); //호출 할려면 부모클래스에 디폴트 생성자를 만들던가 여기서 인자값을 넣어줘야함
    System.out.println("Derived() 생성자 호출됨");
  }//자식 클래스의 생성자를 호출하면  부모클래스의 생성자를 호출함
}
