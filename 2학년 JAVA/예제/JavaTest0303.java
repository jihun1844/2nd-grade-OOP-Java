class Test1 {
  // double square(double df) {
  //   return df * df;
  // }

  // int square(int num) {
  //   return num * num;
  // }

  // void test() {
  //   System.out.println("테스트 메소드");
  // }
}



public class JavaTest0303 {
  // 인스턴스
  private String name; //맴버 변수()

  //인스턴스 메소드
  String getName() {
    return name; //this.name 이 생략된것임
  }

  
  //스테틱 메소드
  //인스턴스를 생성 안해도 접근 가능
  static void sayHello() {
    System.out.println("hi");
  }


  void setName(String argName) {
    name = argName;

    //this.name = name
    //맴버변수의name = 인자값의name
  }


  //메소드 오버로딩
  //같은 이름 이라도 인자값의 개수나 자료타입이 다르면 가능
  double square(double df) {
    return df * df;
  }

  int square(int num) {
    return num * num;
  }

  void test() {
    System.out.println("테스트 메소드");
  }

  public static void main(StringTest[] args) {

    // if (args.length == 0) {
    //   System.out.println("Usage: java javaTest name");
    //   return;
    // } else {
    //   System.out.println("Hello" + args[0]);
    // }


    JavaTest0303 t = new JavaTest0303();

    int result = t.square(3);
    System.out.println(result); 
    
    double result2 = t.square(3.14);
    System.out.println(result2);

    JavaTest0303.sayHello(); //스테틱 메소드는 참조변수 없이 그냥 호출가능
  }
}