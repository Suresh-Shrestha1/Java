// 7) Write a program in java to demonstrate inheritance using shape as parent class and extend it to create sub class as triangle, rectangle, square and override the method area() respectively.

class Shape{
    double length, breadth, height;
    // Method to calculate area
    double area(){
        return 0;
    }
}

class Triangle extends Shape{
    Triangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    // Overriding the area method
    double area(){
        return 0.5 * length * height;
    }
}

class Rectangle extends Shape{
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    // Overriding the area method
    double area(){
        return length * breadth;
    }
}

class Square extends Shape{
    Square(double length){
        this.length = length;
    }
    // Overriding the area method
    double area(){
        return length * length;
    }
}

public class inheritance{
    public static void main(String args[]){
        Triangle myTriangle = new Triangle(5, 7);
        Rectangle myRectangle = new Rectangle(8, 6);
        Square mySquare = new Square(4);
        System.out.println("Triangle area: " + myTriangle.area());
        System.out.println("Rectangle area: " + myRectangle.area());
        System.out.println("Square area: " + mySquare.area());
        // System.out.println("Triangle area: " + myTriangle.area()+ ", Rectangle area: " + myRectangle.area()+"& Square area: " + mySquare.area());
    }
}