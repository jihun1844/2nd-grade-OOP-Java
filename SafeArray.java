package test;

public class SafeArray {
  private int[] a;

  public void createArray(int size) {
    a = new int[size]; //배열 생성

  }
  //배열안에 값을 부르는 메서드
  public int get(int index) {
    if (index >= 0 && index < a.length)
      return a[index];
    System.out.println("잘못된 index 이다" + index);

    //없는 값을 부를땐 -1이 출력
    return -1; //배열안에 -1이 들어갈수 없다는 가정하에 넣음 
  }
  
  //배열안에 값을 넣는 메서드
  public void put(int index, int value) {
    if (index >= 0 && index < a.length) {
      a[index] = value;
      return;
    }
      System.out.println("잘못된 index 이다" + index);
      
      
  }
}
