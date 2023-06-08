package generic;

import java.util.*;
public class CollectionTest {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("김");
    names.add("박");
    names.add("최");
    names.add("이");
    names.add("권");

    for (String name : names) {
      System.out.println(name);
    }
    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(10);
    ages.add(3);
    ages.add(5);
    ages.add(56);
    ages.add(87);

    for (int age : ages) {
      System.out.println(age);
    }


  }

  
}
