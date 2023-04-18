package Employee;

public class Manager extends Employee {
  private int bonus;

  public Manager(String name, String address, int salary, int rrn, int bonus) {
    //원래 super()가 안보이지만 있음 super때문에 부모 생성자가 실행됨
    //자식의 생성자가 호출되면 부모도 호출됨
    //근데 부모의 생성자가 디폴트가 없고 매개변수를 받는 생성자만 있으면 super로 인수를 넣어줘야함
    super(name, address, salary, rrn);

    this.bonus = bonus;
  }

  
  void test() {
    System.out.println("name = " + name);
    System.out.println("address = " + address);
    System.out.println("salary = " + salary);

    //System.out.println("rrn = "+ rrn ); 자식 클래스에서 부모 클래스의 private는 접근할수 없다 
  }

}
