package BANK;

public class ABank extends Bank {
  public double getInterestRate() {
    return super.getInterestRate() + 3.0;
  }
}