package generic;

public class IntBox {
  private Integer value;

  public Integer getValue() {
    // value = 3;     //자동으로 int 값으로 변환, auto Boxing
    int v = value; //자동으로 Integer 값을 int 값으로 변환 auto Unboxing
    return v;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
}
