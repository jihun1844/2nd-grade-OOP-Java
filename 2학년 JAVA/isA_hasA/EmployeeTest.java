package is_a_has_a;

public class EmployeeTest {
  public static void main(String[] args) {
    Date D = new Date(2000, 11, 20);
    Employee E = new Employee("jihun", D);
    System.out.println(E);
  }
}
