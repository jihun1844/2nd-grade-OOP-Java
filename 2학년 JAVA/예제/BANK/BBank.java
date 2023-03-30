package BANK;

public class BBank extends Bank {
  public double getInterestRate() {
    return super.getInterestRate() + 5.0;
  }
}