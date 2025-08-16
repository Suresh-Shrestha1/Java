// 13) Write a program in java to demonstrate the use of throw and throws keywords in Exception Handling.

import java.util.Scanner;
public class throwAndthrows {
    // this method throws an error
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // throw an error
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        sc.close();
    }
}
