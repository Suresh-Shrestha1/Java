// 5) Write a program in Java to demonstrate constructor overloading.

class Box{
    double height;
    double width;
    double depth;

    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    Box(double height){
        this.height = height;
        this.width = 1.0;
        this.depth = 1.0;
    }
    
    Box(){
        this.height = 1.0;
        this.width = 1.0;
        this.depth = 1.0;
    }
    
    double volume(){
        return height * width * depth;
    }
}

public class constructorOverloading{
    public static void main(String args[]){
        Box myBox1 = new Box(10, 20, 30);
        Box myBox2 = new Box(20);
        Box myBox3 = new Box();
        System.out.println("Volume of myBox1: " + myBox1.volume() + ", Volume of myBox2: " + myBox2.volume() + " & Volume of myBox3: " + myBox3.volume());
    }
}