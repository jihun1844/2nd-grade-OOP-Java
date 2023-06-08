package generic;

public class Test {
  public static void main(String[] args) {
    // IntBox id = new IntBox();
    // id.setValue(10);
    // System.out.println(id.getValue());

    // IntBox id2 = new IntBox();
    // id2.setValue(20);

    // int result = id.getValue() + id2.getValue();
    // System.out.println(result);

    // StrBox sb1 = new StrBox();
    // sb1.setValue("동해물");

    // StrBox sb2 = new StrBox();
    // sb2.setValue("백두산");

    // String result = sb1.getValue() + sb2.getValue();
    // System.out.println(result);

    // int idx = result.indexOf("백두산");
    // System.out.println(result.substring(idx));

    Box b1 = new Box();
    b1.setValue(20);

    Box b2 = new Box();
    b2.setValue(30);

    int result = (int) b1.getValue() + (int) b2.getValue();
    System.out.println(result);

    Box strBox = new Box();
    strBox.setValue("진혼곡");
    Object v = strBox.getValue();
    int idx = ((String) v).indexOf("우리나라");
    System.out.println(((String) v).substring(idx));

    int val = (int) strBox.getValue();
    System.out.println("프로그램을 종료합니다ㅣ"); //이건 컴파일 애러가 남
    /*
     문제점
     1. 값을 빼서 쓸때 명시적 타입 캐스팅(형변환)을 해야한다 => 귀찮다, 런타임 오류 발생
     */
  
  }
}


