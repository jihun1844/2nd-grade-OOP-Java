//클래스안에 선언된 클래스를 내부 클래스라고 함

public class OuterClass {
  private int value = 10;

  class InnerClass { //내부 클래스안에서는 외부 클래스의 private변수들을 참조 할수있다
    public void myMethod() {
      System.out.println("외부클래스의 private 변수값 : " + value); //private이지만 사용가능
    }
  }

  OuterClass() {
    InnerClass obj = new InnerClass();
    obj.myMethod();
  }
  
  public static void main(String[] args) {
    OuterClass outer = new OuterClass();
  }
}
