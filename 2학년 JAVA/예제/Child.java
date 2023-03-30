public class Child extends Parent {
  public void print() {
    super.print();
    System.out.println("자식클래스의 print() 메소드");
  }
  public static void main(String[] args) {
    Child c = new Child();
    c.print();
  }
}
