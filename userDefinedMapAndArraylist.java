// 19) Write a program to create a user-defined object  collection into map and arraylist.

import java.util.*;

// Define a user-defined class Student
class Student {
    String name; // Student name
    int age;     // Student age

    // Constructor to initialize student object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Optional: toString() method (not used in this version)
    // This method helps when printing objects directly
    /*
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
    */
}

public class userDefinedMapAndArraylist {
    public static void main(String[] args) {

        // Create an ArrayList to store Student objects
        ArrayList<Student> sList = new ArrayList<>();

        // Create a HashMap to store Student objects with Integer keys
        Map<Integer, Student> sMap = new HashMap<>();

        // Creating Student objects
        Student s1 = new Student("Bhushan", 20);
        Student s2 = new Student("Sujan", 22);
        Student s3 = new Student("Sohan", 21);

        // Adding Student objects to the ArrayList
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        // Displaying the contents of the ArrayList
        System.out.println("ArrayList of Students:");
        for (Student s : sList) {
            // Printing individual fields without using toString()
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
        // while (it.hasNext()) {
        //     Student s = it.next();
        //     System.out.println("Name: " + s.name + ", Age: " + s.age);

        // }

        // Adding Student objects to the HashMap with student ID as key
        sMap.put(1, s1);
        sMap.put(2, s2);
        sMap.put(3, s3);

        // Displaying the contents of the HashMap
        System.out.println("\nHashMap of Students:");
        for (Map.Entry<Integer, Student> entry : sMap.entrySet()) {
            Student s = entry.getValue();
            // Printing key and student details manually
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + s.name + ", Age: " + s.age);
        }
    }
}

