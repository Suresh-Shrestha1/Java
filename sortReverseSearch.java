// 20) Write a program to demontrate sort(), reverse() and search() methods of Collections framework.

import java.util.*;

public class sortReverseSearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Adding elements to the list
        list.add(55);
        list.add(12);
        list.add(38);
        list.add(1);
        list.add(24);

        // Displaying the original list
        System.out.println("Original List: " + list);

        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Reversing the list
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Searching for an element in the list
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int num = scanner.nextInt();
        if(list.contains(num)) {
            System.out.println(num + " is found in the list.");
        } 
        else {
            System.out.println(num + " is not found in the list.");
        }

        // // Searching using binary search (requires sorted list)
        // Collections.sort(list); // Ensure the list is sorted before binary search
        // int index = Collections.binarySearch(list, num);
        // if(index >= 0) {
        //     System.out.println(num + " found at index: " + index);
        // } 
        // else {
        //     System.out.println(num + " not found in the list.");
        // }
        // Closing the scanner
        scanner.close();
    }
}
