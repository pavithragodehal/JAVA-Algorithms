package p1; //package #1
public class B{
  public static void main (String[] args){
    A a1 =new A();/* Error, if we make a constructor public, then it's object
                     can be created in same package and in different package as well*/
  }
}
