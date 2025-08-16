// 9) Write a program to demonstrate the use of interfaces in java.

interface Area{
    void calculateArea(int length, int breadth);
}

interface Perimeter{
    void calculatePerimeter(int length, int breadth);
}

class Rectangle implements Area, Perimeter{
    // implement the abstract method of Area interface and Perimeter interface
    public void calculateArea(int length, int breadth){
        System.out.println("Area of rectangle: " + length * breadth);
    }
    public void calculatePerimeter(int length, int breadth){
        System.out.println("Perimeter of rectangle: " + 2 * (length + breadth));
    }
}

public class interfaces{
    public static void main(String args[]){
        Rectangle myRectangle = new Rectangle();
        myRectangle.calculateArea(4, 5);
        myRectangle.calculatePerimeter(4, 5);
    }
}