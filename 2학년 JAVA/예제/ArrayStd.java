import java.util.Scanner;

public class ArrayStd {
  public void getValue(int[] array) {
    Scanner scn = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      System.out.println("성적을 입력 하시요");
      array[i] = scn.nextInt();
     }
  } 

  public double getAverage(int[] array) {
    double total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }
    return total / array.length;
  }

}
