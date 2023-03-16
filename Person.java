package test;
//같은 패킷에 없는 클레스는 사용안됨

public class Person {
  //1. 맴버 변수는 특정 이유가 없으면 private을 붙여라
  //2. 그 맴버 변수를 클래스 외부에서 접근해야 한다면 그를 위한 매소드를 public으로 구현 해라
  //3. 예를 들어 myAge 라는 맴버 변수에 값을 설정 해야 하는 메소드는 setAge 로 myAge라는 맴버 변수의 값을 읽어 오는 매소드는 getAge로
  //4. public 접근제어 지정자를 명시하여 구현하면 된다

  //이렇게 함으로써 맴버 변수에 잘못된 값이 설정되는 것을 막을수 있고 향후에 그 클래스를 버전 업하면서 맴버 변수의 이름을 변경해도
  //그 클레스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.

  /*접근제어 지정자
    : public, protected, default, private
    public이 명시된 맴버 변수,메소드는 그 클래스 내부,외부 어디서든 접근 가능
    
    protected 가 명시된 member는 그 클레스 내부, 그리고 그 클래스의 자식, 그리고
    그 클래스와 같은 패키지에 속한 다른 클래스에서도 접근 가능하다 (다른 패키지 빼고 퍼블릭과 동일)
    
    접근제어지정자가 명시되지 않으면 이를 default 접근제어 지정자다 하고함
    default = 그 클래스 내부 그리고 그 클래스 와 같은 패키지에 속한 다른 클래스에서도 접근 가능하다
    (자식에서는 접근 안됨)
  
    private 은 같은 클래스말고 다 안됨
  
    멤버 변수를 private로 설정하는 이유는
    1. 잘못된 값을 설정하는것을 막아줄 필요가 있다
    2. 읽기 전용 멤버 변수로 만들수 있다
    3. 클래스 소스코드를 업그레이드 할 경우, 그 클래스를 사용하는 다른 코드에
        미치는 영향을 최소화 할수 있다

  
   */

  private String name = "홍길동"; //private을 붙이면 외부에서 접근 안됨
  private int myAge; 
  //private String dept = "컴정";
  String dept = "컴정";

  public String getDept(){
    return dept;
  }


  //특정 이유가 없으면 퍼블릭을 붙여라
  public String getName() { //값을 읽어
    return name;
  }

  public void setName(int age) {  //값을 설정
    this.myAge = age;
  }

  public void setAge(int age) {  //값을 설정
    if (age >= 0 && age <= 150)
      this.myAge = age;
    System.out.println("나이는 0에서 150 이다");
  }

  public int getAge(){ //값을 읽어
    return myAge;
  }
 }
