public class Rectangle {
  private int x, y;
  private int width, height;


  //본인이 받는 인자값 타입과 갯수가 맞는 생성자가 호출

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public Rectangle(int width, int height) {
    //생성자 안에서 다른 생성자를 불러준다 this를 사용
    this(0, 0, width, height);
  }
}
