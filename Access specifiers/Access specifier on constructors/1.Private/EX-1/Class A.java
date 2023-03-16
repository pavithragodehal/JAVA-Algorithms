package p1;//package #1
public class A {
  private A(){
    
  }
public static void main(String[] args){
   A a1 = new A(); //Error,if we make a constructor private, then it,s object cannot be created outside the class
}
}
