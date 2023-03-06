class Box {
  int width;
  int length;
  int height;

  void prt() {
    System.out.println("상자의 가로, 세로, 높이는 "+ width + " ,"+length+ " ,"+ height + "입니다");
  }
}


public class BoxTest {
  public static void main(String[] args) {
    Box box = new Box();

    box.width = 20;
    box.length = 20;
    box.height = 30;

    box.prt();
    
  }
}
