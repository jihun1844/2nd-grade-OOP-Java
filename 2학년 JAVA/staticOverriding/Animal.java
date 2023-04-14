package staticOverriding;

public class Animal {
  //모든 Animal 클래스의 인스턴스가 공유하는 정적 메소드
  public static void eat() {
    System.out.println("동물이 밥을 먹음");
  }
 
  //sound는 인스턴스 메소드이다
  //즉 객체가 생성 되어야만 존재할수 있는 메소드임
  public void sound() {
    System.out.println("Sound of animal");
  }
}
