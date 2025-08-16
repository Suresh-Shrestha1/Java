// 1) Write a program in java to find gratest and smallest number entered by the user.

import java.util.Scanner;

public class greatsmall{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid Number");
            sc.close();
            System.exit(0);
        }
        int[] num = new int[n];
        System.out.println("Enter the value: ");
        for(int i=0; i<num.length; i++)
        {
            num[i] = sc.nextInt();
        }
        int smallest = num[0];
        int greatest = num[0];
        for(int i=0; i<num.length; i++)
        {
            if(num[i] > greatest){
                greatest = num[i];
            }
            if(num[i] < smallest){
                smallest = num[i];
            }
        }
        System.out.println("The greatest number is " +greatest);
        System.out.println("The smallest number is " +smallest);
        sc.close();    
    }
}