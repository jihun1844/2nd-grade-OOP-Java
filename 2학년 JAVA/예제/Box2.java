public class Box2 {
  private int width;
  private int length;
  private int height;
  
  
  public int getVolume() {
    return width * height * length;
  }

  Box2(int w, int l, int h) {
    width = w;
    length = l;
    height = h;
    
  }
  
  public static Box2 whoisLargerBox(Box2 box1, Box2 box2) {
    if (box1.getVolume() > box2.getVolume()) {
      return box1;
    }
    return box2;
  }
  public static void main(String[] args) {
    Box2 b1 = new Box2(10, 10, 10);
    Box2 b2 = new Box2(10, 20, 30);

    Box2 largerBox = Box2.whoisLargerBox(b1, b2);
    System.out.println("더 큰 박스의 부피: " + largerBox.getVolume());

  }

}
