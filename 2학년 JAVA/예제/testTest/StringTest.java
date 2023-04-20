package testTest;

import java.util.Scanner;

public class StringTest {
  public static void main(String[] args) {
    String str;
    Scanner scn = new Scanner(System.in);

    while (true) {
      System.out.println("문자를 입력 하시오");
      str = scn.next();
      if (str.equals("quit") == true) {
        break;
      }
      if (str.matches("^www\\.(.+)")) {
        System.out.println(str+ "은 'www'로 시작함");
      
      } else {
      System.out.println("시작한함");
    }
  }
}
}