package BANK;

public class BankTest {
  public static void main(String[] args) {
    ABank a = new ABank();
    BBank b = new BBank();
    CBank c = new CBank();

    System.out.println("A은행의 이자율 : " + a.getInterestRate());
    System.out.println("B은행의 이자율 : " + b.getInterestRate());
    System.out.println("C은행의 이자율 : " + c.getInterestRate());
  }
}
