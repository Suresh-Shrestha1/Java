// 2) Write a program in java to add two 2D arrays.

import java.util.Scanner;
public class arrayAddition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        System.out.print("Ente the no of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        cols = sc.nextInt();
        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];
        System.out.println("Enter the value in first array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("arr1[" + i + "]"+"[" + j + "] : ");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value in second array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("arr2[" + i + "]"+"[" + j + "] : ");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The addition of arr1 and arr2 : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr1[i][j] + arr2[i][j] + "\t ");
            }
            System.out.println("");
        }
        sc.close();
    }   
}