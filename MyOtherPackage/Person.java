// 11) Write a program in java to demonstrate packages.

// In myotherpackage/Person.java
package MyOtherPackage;

// Class to represent a person
public class Person {
    String name;
    int age;
    String address;
    
    // Constructor to initialize the person object
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Method to display the details of the person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}