package interfacetest;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Timer;



public class CallBackTest {
  public static void main(String[] args) {
    MyClass listener = new MyClass();
    ActionListener listener2 = new MyClass();

    Timer timer = new Timer(1000, listener);
    timer.start();

    Scanner scn = new Scanner(System.in);
    System.out.println("enter");
    scn.nextLine();
    scn.close();
  }
}

class MyClass implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Beep");
  }
}

