package test;


public class PersonTest {

  public static void main(String[] args) {
    Person p = new Person();
    p.setAge(20);
    System.out.println(p.getAge());

    System.out.println(p.getName());
    System.out.println(p.getDept());


  }
}