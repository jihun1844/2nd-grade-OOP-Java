package inheritance;

public class SportCar extends Car {
  boolean turbo;

  public boolean isTurbo() {
    return turbo;
  }

  public void setTurbo(boolean flag) {
    turbo = flag;
  }
}