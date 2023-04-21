package interfacetest;

import sortingAlgorithmTest.*;

public class Test {
  public static void main(String[] args) {
    // String s1 = "ABC";
    // String s2 = "ABC";
    // System.out.println(s1.compareTo(s2));
    // Student std1 = new Student("일지매", "홍길동");
    // Student std2 = new Student("김김김", "홀길동");
    // findLarger(std1, std2);

    // Car c1 = new Car("BMW" , "g90" , 10 , 20);
    // Car c2 = new Car("BMW", "g50", 20, 30);
    // System.out.println(c1.compareTo(c2)); 
    // findLarger(c2, c1);

    // Car c3 = new Car();
    // System.out.println(c3);

    // Student[] stds = new Student[5];
    // Student std1 = new Student("일지매", "컴정");
    // stds[0] = std1;
    // Student std2 = new Student("이지매", "홍길동");
    // stds[1] = std2;
    // Student std3 = new Student("삼지매", "홍길동");
    // stds[2] = std3;
    // Student std4 = new Student("사지매", "홍길동");
    // stds[3] = std4;
    // Student std5 = new Student("오지매", "홍길동");
    // stds[4] = std5;

    // Util.SelectionSort(stds);

    // for (Student std : stds) {
    //   System.out.println(std.getName());
    // }

    Car[] cars = new Car[5];
    Car c1 = new Car("BMW", "g90", 10, 20);
    cars[0] = c1;
    Car c2 = new Car("Hyundai", "g50", 20, 30);
    cars[1] = c2;
    Car c3 = new Car("GM", "asd", 10, 20);
    cars[2] = c3;
    Car c4 = new Car("KIA", "k9", 10, 20);
    cars[3] = c4;
    Car c5 = new Car("Benz" , "E300" , 10 , 20);
    cars[4] = c5; 
    SortingUtil.SelectionSort(cars);
    for (Car car : cars) {
      System.out.println(car);
    }
  }

  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다");
    } else {
      System.out.println("두번째가 크다");
    }
  }
}
