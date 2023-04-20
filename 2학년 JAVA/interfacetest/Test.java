package interfacetest;

public class Test {
  public static void main(String[] args) {
    String s1 = "ABC";
    String s2 = "ABC";
    System.out.println(s1.compareTo(s2));
    Student std1 = new Student("일지매", "홍길동");
    Student std2 = new Student("김김김", "홀길동");
    findLarger(std1, std2);
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
