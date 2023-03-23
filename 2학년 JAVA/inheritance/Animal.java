package inheritance;

public class Animal {
  private double weight;
  private String picture;

  protected void eat() {
    System.out.println("eat()");
  }

  void sleep() {
    System.out.println("sleep() 가 호출됨");
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getPicture() {
    return picture;
  }

  public void setPictrue(String pString) {
    this.picture = pString;
  }
}
