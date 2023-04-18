package testTest;

import java.security.Principal;

public class Car {
  private String model;
  private String color;
  private int speed;

  private int id;
  static int number;

  public Car(String m, String c, int s) {
    model = m;
    color = c;
    speed = s;
    id = ++number;
  }

  // public static int getTest() {

  //   return speed;
  // }

  public int getSpeed() {
    return number;
  }
  
  
}
