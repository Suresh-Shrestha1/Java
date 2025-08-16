// 4) Write a program in java to display fibonacci series upto 'N'.

import java.util.Scanner;
public class fibonacci {
    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of terms: ");
        int num = sc.nextInt();
        System.out.print("The fibonacci series upto " + num + " terms: ");
        for(int i = 0; i < num; i++){
            System.out.print(fibo(i) + " ");
        }
        sc.close();
    }
}
