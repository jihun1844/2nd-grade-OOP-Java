public class ArrayProc {

  void inc(int[] array) {  //list배열의 값을 1씩 더해주는 메소드
    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] + 1;
    }
  }
  public static void main(String[] args) {
    int[] list = { 1, 2, 3, 4, 5 };
    ArrayProc obj = new ArrayProc();

    obj.inc(list);  //현재 list의 주소값을 메소드에 전달

    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i] + " ");
    }
  }
}
