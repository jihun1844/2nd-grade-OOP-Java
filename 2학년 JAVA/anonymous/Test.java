package anonymous;

public class Test {
  public void test(MyInterface1 m1) {
    m1.print("hello world");
  }

  public static void main(String[] args) {
    Test t = new Test();

    // // 1. 무명 클래스를 이용해  Test클래스의 인스턴스 메소드 test 호출하시오
    // t.test(new MyInterface1() {
    //   public void print(String s) {
    //     System.out.println(s);
    //   }
    // });

    //람다를 이용해 test 클래스의 인스턴스 메소드 test를 호출 하시오
    //람다 : 인터페이스인데 오직 하나의 추상 메소드를 가지는 인터페이스는 람다로 구현 가능
    t.test((s) -> {
      System.out.println(s); //MyInterface1를 구현한 객체다
    });

    int r = sum(100, 200, 105, (n1, n2) -> n1 + n2);
    int r2 = sum(100, 200, 105, new MyAdd());

  }

  public static int sum(int n1, int n2, int n3, Add add) {
    int result = add.add(n1, n2);
    result = add.add(result, n3);
    System.out.println(result);
    return result;
  }
}

class MyAdd implements Add {
  public int add(int n1, int n2) {
    return n1 + n2;
  }
}

interface Add {
  int add(int n1, int n2);
}


