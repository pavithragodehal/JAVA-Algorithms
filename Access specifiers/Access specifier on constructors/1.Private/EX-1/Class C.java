package p2; //package #2
import p1.A;
public class c {
  public static void main(String[] args){
    A a1 = newA(); //Error,if we make a constructor private, then it,s object cannot be created outside the class
  }
}
