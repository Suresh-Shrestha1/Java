// 6. Write a program to demonstrate the method overloading in Java.

class Addition{
    int x, y, z;
    Addition(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int sum(int x, int y, int z){
        return x + y + z;
    }

    int sum(int x, int y){
        return x + y+this.z;
    }
    
    int sum(){
        return this.x + this.y + this.z;
    }
}

public class methodOverloading{
    public static void main(String args[]){
        Addition obj = new Addition(5, 10, 15);
        System.out.println("Sum with 3 parameters: " + obj.sum(10, 20, 30));
        System.out.println("Sum with 2 parameters: " + obj.sum(10, 20));
        System.out.println("Sum with 0 parameters: " + obj.sum());
    }
}