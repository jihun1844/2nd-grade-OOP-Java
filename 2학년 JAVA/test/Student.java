package test;

import java.time.LocalDate;

public class Student {
  private String name;
  private int year;

  //name에 값을 넣는 메소드
  public void setName(String name) {
    this.name = name;
  }

  //year의 값을 넣는 매소드
  public void setYear(int year) {
    if (year >= 1900) {
      this.year = year;
      return;
    }
  }
  //멤버 변수인 name을 불러오는 메소드
  public String getName() {
    return name;
  }

  //몇살인지 찾는 매소드
  public int getAge() {
    LocalDate d = LocalDate.now(); //현재 시간을 가져올수 있음
    int nowYear = d.getYear();
    return (nowYear - year);
  }
}
