package p2; //package #2
import p1.A;
public class C{
  public static void main (String[] args){
    A a1 =new A();/* Error, if we make a constructor public, then it's object
                     can be created in same package and in different package as well*/
  }
}
