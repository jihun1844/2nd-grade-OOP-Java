package test;

public class MyCounter {
  private int value;

  public static void addOne(int val) { //원본 val에는 아무 영향을 끼치지 않는다
    val = val + 1;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  //콜바이 레퍼런스 직접 값에 영향을 끼침
  public static void increase(MyCounter cntObj) { //인자 값은 MyCounter의 주소값 (클래스의 참조변수와 같음)
    int v = cntObj.getValue() + 1;
    cntObj.setValue(v);
  }
   
  public static void main(String[] args) {
    // int val = 10;
    // MyCounter.addOne(val);
    // System.out.println(val);
    MyCounter mc = new MyCounter();  //참조변수를 찍음
    mc.setValue(10);          
    MyCounter.increase(mc);          //increase은 static이니 그냥 부를수있음
    System.out.println(mc.getValue());
  }
}
