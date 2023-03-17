import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class String예제 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    while (true) {
      System.out.println("문자열을 입력 하시요 : ");
      String str = scn.nextLine();

      String find = "www";
      String out = "quit";

      if (str.equals(out)) { //프로그램 종료
        break;
      }
      else if (str.substring(0, 3).equals(find)) { //www로 시작하는 문자열 찾기 
        System.out.println(str + "은 " + find + "로 시작합니다");
      } else {
        System.out.println(str + "은 " + find + "로 시작하지 않습니다"); //www로 시작하지 않으면 출력
      }
      

    }
  }
}
