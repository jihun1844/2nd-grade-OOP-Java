package generic;

import sortingAlgorithmTest.Student;

public class GenericTest {
  public static void main(String[] args) {
    GenericBox<Integer> box1 = new GenericBox<Integer>();
    box1.setValue(100);
    // 잘못된 타입의 값을 주면 컴파일 타임때 그 오류를 잡아준다
    //box1.setValue("하하하");
    int val = box1.getValue();  //명시적인 타입 캐스팅이 필요 없다
    System.out.println("박스의 내용은[" + val + "] 입니다");
    

    GenericBox<String> box2 = new GenericBox<String>();
    box2.setValue("동해물");
     // 잘못된 타입의 값을 주면 컴파일 타임때 그 오류를 잡아준다
    //box2.setValue(10);
    String sval = box2.getValue();  //명시적인 타입 캐스팅이 필요 없다
    System.out.println("박스의 내용은[" + sval + "] 입니다");

    //<>는 선언에서 적어두면 new뒤에는 <> 내용을 생략
    
    GenericBox<Student> box3 = new GenericBox<>();
    Student std = new Student("고길동", "컴정");
    box3.setValue(std);
    Student val3 = box3.getValue();
    System.out.println("박스의 내용은[" + val3.getName() + "] 입니다");
  }
}
