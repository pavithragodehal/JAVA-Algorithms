package p1;//package #1
public class A {
 protected A() {
   
 }
public static void main(String[] args){
   A a1 = new A(); /*Error,if we make a constructor protected, then it,s object can be created in 
                       same package but not in different package,i.e same as default*/
}
}
