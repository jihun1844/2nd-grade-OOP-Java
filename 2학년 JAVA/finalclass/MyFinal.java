package finalclass;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFinal extends JFrame {
  public MyFinal() {
    setSize(30, 30);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("My frame");
    setLayout(new FlowLayout());

    JButton button = new JButton("버튼");
    add(button);
    setVisible(true);
  }
  public static void main(String[] args) {
    MyFinal f = new MyFinal();
  }
}
