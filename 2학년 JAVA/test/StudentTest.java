package test;

public class StudentTest {
  public static void main(String[] args) {
    Student std = new Student();
    std.setName("고길동");  //맴버 변수인 name은 private이라서 직접 접근이 안되니 메소드를 만들어서 값을 넣음
    std.setYear(2002);


    System.out.println(std.getName());
    System.out.println(std.getAge());
  }
}
