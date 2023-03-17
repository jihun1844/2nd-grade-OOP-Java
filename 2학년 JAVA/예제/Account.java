public class Account {
  private int regNumber;
  private String name;
  private int balance;

  //매개변수를 가져가는 메소드
  public String getName() {
    return name;
  }
  //가져온 인자값을 매개변수에 넣는 메소드
  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
