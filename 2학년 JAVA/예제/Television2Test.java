public class Television2Test {
  public static void main(String[] args) {
    //참조변수를 선언할때 인자값을 같이 넣어줘서 생성자에 인자값을 전달
    Television2 myTv = new Television2(7, 10, true);
    myTv.print();

    Television2 myTv2 = new Television2(123, 44, true);
    myTv2.print();
  }
}
