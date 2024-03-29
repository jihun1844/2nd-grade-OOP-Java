package interfacetest;

//Student 클래스는 Comparable 인터페이스의 모든 메소드를 구현 해야한다(강제)
public class Student implements Comparable{
  private String name;
  private String dept;

  public String getName() {
    return name;
  }

  public Student(String name, String dept) {
    this.name = name;
    this.dept = dept;
  }

  @Override
  //compareTo = 내가 더 크면1 , 값이 같으면 0, 내가 더 적으면 -1
  public int compareTo(Comparable obj) {
    //null인 경우는 없다고 가정
    //interface는 class 처럼 데이터 타입으로 사용할수 있다
    //특정 interface타입의 변수는 그 interface를 구현하는
    //모든 클래스(와 그 클래스의 모든 후손 클래스)의 객체를 담을수 있다  
    Student std = (Student) obj;
    //String 클래스는 java.lang 패키지의 Comparable 인터페이스를 이미 구현하고 있다
    //compareTo 메소드를 구현 하고 있다

    //String의 compareTo 메소드는 비교 대상보다
    //사전 순서상 앞에 위치하면 -1, 같으면 0, 뒤에 위치하면 1을 반환 한다
    return name.compareTo(std.getName());
  }

}
