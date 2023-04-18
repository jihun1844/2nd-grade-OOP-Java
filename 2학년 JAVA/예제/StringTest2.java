import javax.swing.plaf.synth.SynthStyleFactory;

public class StringTest2 {

  public static void main(String[] args) {
    String proverb = "A barking dog";
    String s1, s2, s3, s4;
    System.out.println(proverb.length());

    //선언된 변수에 넣어 줘야함proverb.concat
    s1 = proverb.concat("never Bites!");//문자열을 이어 붙이는 함수
    System.out.println(s1);

    s2 = proverb.replace('b', 'B'); //문자열 안의 글자를 바꾸는 함수
    System.out.println(s2);

    //                        2이상          3미만    사이의 index번호에 해당하는 값을 들고옴
    s3 = proverb.substring(2, 3);
    System.out.println(s3);

    s4 = proverb.toUpperCase(); //해당 문자열을 전부 대문자로 바꾼다
                                //소문자는 toLowerCase
    System.out.println(s4);
    
    //----------------------------

    int x = 20;
    System.out.println("결과없음" + x);//내부적으로 x의 값을 문자열로 바꿔서 결과가 출력된다
    System.out.println("100" + x);    //문자열과의 덧셈은 안되니 위와 같은 흐름이 됨
    System.out.println(100 + x);      //둘다 숫자이니 덧셈 가능
    
    String s = "1234";

    int n = Integer.parseInt(s);        //문자열을 int로 바꾸어주는 함수

    double b = Double.parseDouble(s);   //바꾸고 싶은 기초 자료형 마다 다 있음
    Float f = Float.parseFloat(s);
    long l = Long.parseLong(s);

  }
}