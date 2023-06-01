package lambda;

import java.time.LocalDate;

import java.util.*;

public class test {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", LocalDate.of(2000, 11, 20), "aaaa@gmali.com", Sex.MALE);
    Person p2 = new Person("이지매", LocalDate.of(1990, 7, 10), "bbbb@gmali.com", Sex.FEMALE);
    Person p3 = new Person("삼지매", LocalDate.of(2005, 3, 8), "cccc@gmali.com", Sex.MALE);

    //list는 인터페이스, 이 인터페이스를 구현하는 클래스로
    //ArrayList, LinkedList 등이 있다.
    //Person 타입의 객체를 원소로 가질수 있는 리스트를 생성
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);

    printPersonOlderThen(list, 20, 50);
    printPerson(list, new CheckPersonFemale10to20());
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