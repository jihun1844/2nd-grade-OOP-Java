public class Point {
  private int x, y;

  public Point(int x, int y){
    this.x = x;
    this.y = y;


  }
  //부모로 부터 상속받은 메소드를 재정의 하는것을 오버라이딩이라 한다
  //over riding
  //오브젝트에 있는 toString을 여기서 다시 재정의 해줌
  public String toString() {
    return "x : " + x + "y : " + y;
  }
}
