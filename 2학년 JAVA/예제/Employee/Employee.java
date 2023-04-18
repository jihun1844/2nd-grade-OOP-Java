package Employee;

public class Employee {
  public String name;
  String address;
  protected int salary;
  private int rrn;

  public Employee(String name, String address, int salary, int rrn) {
    this.name = name;
    this.address = address;
    this.salary = salary;
    this.rrn = rrn;
    //생성자는 부모 생성자가 먼저 실행되고 인자값으로 넣은것도 부모 생성자에 먼저 들어감
    //보이는것은 부모가 먼저 실행되는걸로 보이지만 자식생성자의 super 실행후 부모생성자로 넘어옴
    System.out.println(name);
    System.out.println(rrn);
  }

  public String toString() {
    return "Employee [name = " + name + " , address = " + address + ", salary + " + salary + "rrn= " + rrn + "]";
  }
}
