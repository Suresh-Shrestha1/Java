//11) Write a program to demonstrate package in Java.
package MyPackage;

import MyOtherPackage.*;

public class packageDemo {
    public static void main(String args[]) {
        // Create a Person object
        Person person = new Person("John", 25, "New York");

        // Display the person's details
        person.display();
    }
}