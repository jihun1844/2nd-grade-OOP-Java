
class Math {
  int add(int x, int y) {
    return x + y;
  }
}


public class MathTest {
  public static void main(StringTest[] args) {
    int sum;
    Math obj = new Math();
    sum = obj.add(2, 3);
    System.out.println("2와 3의 합은 " + sum);
    sum = obj.add(7, 8);
    System.out.println("7과 8의 합은 " + sum);
    
  }
}
