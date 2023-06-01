package lambda;
import java.time.LocalDate;
import java.time.Period;

public class Person {
  private String name;
  private LocalDate birthDate;
  private String emailAddress;
  private Sex gender;

  public Person(String name, LocalDate birthDate, String emailAddress, Sex gender) {
    this.name = name;
    this.birthDate = birthDate;
    this.emailAddress = emailAddress;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public Sex getGender() {
    return gender;
  }

  public int getAge() {
    // Period p = Period.between(birthDate, LocalDate.now());
    // return p.getYears();
    //위의 코드를 체인 메소드로 한줄로 만들수 있음

    return Period.between(birthDate, LocalDate.now()).getYears();

    //method chaining : 메소드 호풀을 쇠사슬이 연결된것처럼 이어서 쭉 호출하는것
    // ex : this.getName().substring(1, 2);
    
  }

  public void printPerson() {
    System.out.printf("Name : %s, Email : %s, Gender : %s, Birthdate : %s", name, emailAddress, gender.toString(),
        birthDate.toString());
  }
    
}

