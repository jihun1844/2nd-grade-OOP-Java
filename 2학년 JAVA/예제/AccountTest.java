public class AccountTest {
  public static void main(String[] args) {
    Account obj = new Account();
    obj.setName("tom");
    obj.setBalance(10000);
    System.out.println("이름은" + obj.getName() + "통장잔고는 "+ obj.getBalance() + "입니다");
  }
}
