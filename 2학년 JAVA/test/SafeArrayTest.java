package test;

public class SafeArrayTest {
  
  public static void main(String[] args) {
    SafeArray array = new SafeArray();
    array.createArray(10); //크기 10개짜리 배열을 생성

    array.put(2, 100); //put매서드에 인자값을 넣고 실행 
    array.put(10, 200);

    System.out.println(array.get(10));  //배열에 10번째 인덱스값을 출력
  }
}
