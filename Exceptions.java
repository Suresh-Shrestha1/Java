// 12) Write a program in java to demonstrate Exceptions, Arithmetic Exceptions, Array Out of Bound Exception.

public class Exceptions{
    public static void main(String args[]){
        int a = 10;
        int b = 0;
        int arr[] = {1, 2, 3, 4, 5};
        try{
            // This will throw an arithmitic exception
            System.out.println("The division is" +a/b);
            // This will throw an array index out of bound exception
            System.out.println("The element at index 5 is " + arr[5]);
        }
        catch(ArithmeticException e){
            // Catch division by zero error
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            // Catch array index out of bound error
            System.out.println("Array index out of bound");
        }
        catch(Exception e){
            // Catch any other exception
            System.out.println("Something went wrong");
        }
        finally{
            // This block will always
            System.out.println("This block will always execute");
        }
    }
}