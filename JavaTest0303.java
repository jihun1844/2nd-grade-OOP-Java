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
  private String name;

  String getName() {
    return name; //this.name 이 생략된것임
  }                    
  void setName(String argName) {
    name = argName;
  }
 
  double square(double df) {
    return df * df;
  }

  int square(int num) {
    return num * num;
  }

  void test() {
    System.out.println("테스트 메소드");
  }

  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("Usage: java javaTest name");
      return;
    } else {
      System.out.println("Hello" + args[0]);
    }
    JavaTest0303 t = new JavaTest0303();
    int result = t.square(3);
    System.out.println(result); 
    
    double result2 = t.square(3.14);
    System.out.println(result2);
  }
}