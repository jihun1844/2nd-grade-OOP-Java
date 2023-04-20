package polymorphism;

abstract public class Comparable {
  //내가 더 크면1 , anotherVal하고 값이 같으면 0 내가 더 적으면 -1
  public abstract int compareTo(Comparable anotherVal);  
}
