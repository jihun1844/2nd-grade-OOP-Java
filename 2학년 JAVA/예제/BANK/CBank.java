package BANK;

public class CBank extends Bank {
  public CBank() {
    super.setInterestRate(getInterestRate()+10.0);
  }
}
