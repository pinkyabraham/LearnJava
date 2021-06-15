package Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
class A{  //main class
    public void run(){
        System.out.println("In class A.");
    }
}
class B extends A{       // derived class
    public void run(){  //override method from base class
        System.out.println("In class B.");
    }
}
