// 3) Write a program in java to display the factorialof number 'n'.

import java.util.Scanner;

public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("No Factorial");
        }
        else{
            long fact = 1;
            for(int i=1; i<=num; i++){
            fact *=  i;
            }
            System.out.println("The factorial of "+num+" is: "+fact);
        }
        sc.close();
    }
}