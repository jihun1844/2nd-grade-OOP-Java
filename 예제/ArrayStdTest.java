public class ArrayStdTest {
  final static int STUDENTS = 5;
  public static void main(String[] args) {
    int[] scores = new int[STUDENTS];
    ArrayStd obj = new ArrayStd();
    obj.getValue(scores);
    System.out.println("평균은 = "+ obj.getAverage(scores));
   }
} 