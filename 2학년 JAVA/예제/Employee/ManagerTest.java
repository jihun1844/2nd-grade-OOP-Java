package Employee;

public class ManagerTest {
  public static void main(String[] args) {
    Manager m = new Manager("Tom", "seoull", 100000, 123456, 500000);
    //현재 Manager의 생성자는 디폴트는 없고 매개변수를 받는 생성자만 있기때문에 거기에 맞춰서 인자를 넣어줘야함

    System.out.println(m); //부모 클래스인 Employee의 toString 메소드를 부름
    
    m.test();
  }
}
