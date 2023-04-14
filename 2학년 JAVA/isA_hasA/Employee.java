package isA_hasA;

public class Employee {
  private String name;
  private Date birthDate; //has-a 관계 구현한 부분

  public Employee(String argName, Date argBirthDate) {
    birthDate = argBirthDate;
    name = argName;
  }
  
  public String toString() {
    return "직원 이름=" + name + "생일" + birthDate;
  }


  
}
