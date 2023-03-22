package teststatic;

public class Employee {
  private String name;
  private double salary;

  private static int count; //정적변수

  public Employee(String argName, double argSalary) {
    name = argName;
    salary = argSalary;
    count++;
  }

  //객체가 소멸될때 호출
  protected void finalize() {
    count--; //객체가 없어지는거니 1씩 줄어들게 함
  }

  public static int getCount() {
    return count;
  }

  public static void main(String[] args) {
    Employee e1, e2, e3;
    e1 = new Employee("jon", 300);
    e2 = new Employee("tom", 500);
    e3 = new Employee("alen", 800);

    int C = Employee.getCount();
    System.out.println("현재 직원의 수는 :"+ C);
  }
}
