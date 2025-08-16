// 8) Write a program in java to demonstrate abstract class and method.
abstract class Bird{// Abstract class
    // Abstract method
    abstract void fly();
    void drink(){
        System.out.println("Bird is drinking water");
    }
}

class Parrot extends Bird{
    // Overriding the abstract method from the abstract class
    void fly(){
        System.out.println("Parrot is flying");
    }
}

class Owl extends Bird{
    void fly(){
        System.out.println("Owl is flying");
    }
}

public class abstractClass{
    public static void main(String args[]) {
        Parrot parrot = new Parrot();
        Owl owl = new Owl();
        parrot.fly();
        parrot.drink();
        owl.fly();
        owl.drink();
    }
}