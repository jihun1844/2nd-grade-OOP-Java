

public class StringTest {
  public static void main(String[] args) {
    JavaTest0303 s = new JavaTest0303();
    s.setName("wlgns");
    //System.out.println(s.getName());

    String s1 = "홍길동";
    char c = s1.charAt(1); //인텍스 1번쨰의 문자를 반환
    //System.out.println(c);

    //String의 값이 같으면 다른 이름으로 변수를 직어도 새로운 객체를 찍지않는다 그래서 true
    String s2 = "홍길동";
    boolean r = s1 == s2;
    System.out.println(r);

    //new String으로 만든것은 주소값이 다르기 때문에 false
    String s3 = new String("홍길동");
    boolean r2 = s1 == s3;
    //System.out.println(r2);

    //위의 경우에 문자열안의 "값"을 비교하고싶으면 equals를 사용하자
    r = s3.equals(s1);
    //System.out.println(r); //true

    s1 = new String("i love you");
    s2 = new String("i Love you");

    //대소문자와 같이 문자열 비교
    r = s1.equals(s2); //false
    
    //대소문자 구분없이 문자열 비교
    r = s1.equalsIgnoreCase(s2);  //true
    System.out.println(r);
    

    //String 객체는 immutable입니다 , mutable이 아닙니다
    //그말은 String 객체의 값은 변경할수 없다.
  }
}
