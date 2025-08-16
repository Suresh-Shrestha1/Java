// 18) Write a program to show the use of wrapper classes in Java.

import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args) {
        int a= 20;
        Integer objA = Integer.valueOf(a); // Boxing
        System.out.println("Boxed value of a: "+objA);

        Integer autoboxed =a; // Autoboxing
        System.out.println("Autoboxed value of a: "+autoboxed);

        // Unboxing
        Integer objB =  30;
        int b = objB.intValue();
        System.out.println("Unboxed value of b: "+b);

        // Autoboxing and Unboxing in Collections
        int autoUnboxed = objB; // Autoboxing
        System.out.println("Autounboxed value of b: "+autoUnboxed);
        
        // Wrapper classes are used to convert primitive types into objects.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7); // Autoboxing
        list.add(9); // Autoboxing
        list.add(11); // Autoboxing
        System.out.println("List of integers: " + list);
    }
}