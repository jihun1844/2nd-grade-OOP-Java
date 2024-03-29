package lambda;

import java.time.LocalDate;

import java.util.*;

public class test {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", LocalDate.of(2000, 11, 20), "aaaa@gmali.com", Sex.MALE);
    Person p2 = new Person("이지매", LocalDate.of(1990, 7, 10), "bbbb@gmali.com", Sex.FEMALE);
    Person p3 = new Person("삼지매", LocalDate.of(2000, 3, 8), "cccc@gmali.com", Sex.FEMALE);

    //list는 인터페이스, 이 인터페이스를 구현하는 클래스로
    //ArrayList, LinkedList 등이 있다.
    //Person 타입의 객체를 원소로 가질수 있는 리스트를 생성
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);

    //printPersonOlderThen(list, 20, 50);

    //checkPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
    //printPersons 메소드를 호출해라
    //단 이 메소드의 의해 출력되는 Person 객체는 성별이 남자인 객체여야한다
    //printPerson(list, new CheckPersonMale());

    //위와 같이 성별이 남자인 객체만 출력하도록
    //printPerson 메서드를 호출하되, 무명클래스로 작성 
    //CheckPerson 인터페이스를 구현하는 무명클래스를 생성해 printPerson 메서드를 호출하면 됨
    // printPerson(list, new CheckPerson() {
    //   public boolean test(Person p) {
    //     return p.getGender() == Sex.MALE;
    //   }
    // });

    /*
     오직 하나의 추상메소드만 가지는 인터페이스 타입의객체를 람다식으로 생성 할수 있다
     람다식은 이름없는 메소드라 할수 있다
     람다식은 이용하는 이유는 간단하기 때문이다
     람다식을 이용하는 메소드가 필요한 곳에 간단히 메소드를 보낼수 있다
     람다식은 함수형 프로그래밍을 자바에 도입한 것이다
     람다식은 오직 하나의 추상 메소드를 가지는 인터페이스 타입의 객체를 요구하는 메소드의 인자로 전달될수 있다
     람다식의 문법
     (arg1, arg2, ...) -> {body}
     (type1 arg1, type2 arg2, ...) -> {body}
     */

    //위의 무명클래스를 람다식으로 구현 해보자
    //printPerson(list, (p) -> {return p.getGender() == Sex.MALE;});

    //람다식의 body가 return문 하나만으로 구성되어 있으면 return 키워드, {}, 문장 끝의
    //세미콜론(;)도 생략 할수있다
    //printPerson(list, (p) -> p.getGender() == Sex.MALE);

    // printPerson(list, (p)-> {
    //   System.out.println(p.getName());
    //   return p.getAge() >= 30;
    // });

    //람다식의 매개변수가 오직 하나일때는 매개변수를 둘러싸는 () 생략 할수 있다
    // printPerson(list, p -> {
    //   System.out.println(p.getName());
    //   return p.getAge() >= 30;
    // });

    //람다식을 이용해서 printPerson 메소드를 호출하고
    //그 결과로 나이 20에서 30살 사이의 여자만 출력되도록 구현 하라
    printPerson(list, p -> {return p.getGender() == Sex.FEMALE && p.getAge() >= 20 && p.getAge() <= 30;});
  }
  
  //collection framework : List, Set, Map, Stack, Queue
  //collection framework는 여러개의 값을 저장하는 자바의 자료 구조
  //이 자료구조에 들어갈수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할수있다
  //List<Person>, Set<Integer>, Map<String, Person> .....
  public static void printPersonOlderThen(List<Person> persons, int age) {

    //Persons 리스트의 각 원소에 대해서 반복문을 수행한다
    //각 원소를 Person 타입의 변수 P에 저장
    for (Person p : persons) {
      if (p.getAge() >= age) {
        p.printPerson();
        System.out.println();
      }
    }
  }

  //List<Person> list, int low, int high
  //위 3개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(Low 이상, high 미만)를
  //입력 받아, 저 나이 범위의 Person 정보만 출력하는 메소드
  //printPersonWithinAgeRange를 구현
  public static void printPersonOlderThen(List<Person> list, int low, int high) {
    for (Person p : list) {
      if (p.getAge() >= low && p.getAge() <= high) {
        p.printPerson();
        System.out.println();
      }
    }
  }


  //Person 객체의 리스트와 CheckPerson 인터페이스를 구현한 객체를 전달 받고
  //리스트의 각 Person 객체를 tester.test 메소드의 인자로 전달해, 그 반환값이 true이면
  //그 Person 객체의 정보를 출력
  public static void printPerson(List<Person> list, CheckPerson tester) {
    for (Person p : list) {
      if (tester.test(p)) {
        p.printPerson();
        System.out.println();
      }
    }
  }
 
  
}
interface CheckPerson {
  boolean test(Person p);
}

class CheckPersonMale18to25 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
  }
}

class CheckPersonFemale10to20 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.FEMALE && p.getAge() >= 10 && p.getAge() <= 20;
  }
}

class CheckPersonMale implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.MALE;
  }
}

