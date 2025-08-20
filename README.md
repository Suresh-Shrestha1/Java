# 💻 JAVA CLASS Workspace

This workspace contains beginner-friendly Java programs, organized by topic. Each file demonstrates a specific concept in Java, including basic programming, object-oriented principles, data structures, GUI, file handling, packages, and database connectivity. The folder also includes images and output files for demonstration.

📘 Whether you're a beginner or brushing up your skills, this structured approach will help you understand Java concepts step by step through:
- **💡 Basic programming**
- **🧱 Object-Oriented Principles**
- **🗃️ Data Structures**
- **🖼️ GUI Programming**
- **📂 File Handling**
- **📦 Packages**
- **🗄️ Database Connectivity**

📷 The folder also includes images and output files for demonstration purposes.

---

## 📁 File Structure

```
JAVA CLASS/
│
├── Basic Programs/
│   ├── arrayAddition.java
│   ├── factorial.java
│   ├── fibonacci.java
│   └── greatsmall.java
│
├── OOP Concepts/
│   ├── constructorOverloading.java
│   ├── methodOverloading.java
│   ├── inheritance.java
│   ├── abstractClass.java
│   ├── interfaces.java
│   └── wrapperClass.java
│
├── Data Structures/
│   ├── stackDataStruture.java
│   ├── userDefinedMapAndArraylist.java
│   └── sortReverseSearch.java
│
├── Exception Handling/
│   ├── Exceptions.java
│   └── throwAndthrows.java
│
├── File Handling/
│   ├── readWriteByteStream.java
│   ├── readWriteCharacterStream.java
│   ├── output.txt
│   └── output1.txt
│
├── GUI Programs/
│   ├── Sw_image.java
│   ├── ArithmeticOperation.java
│   ├── KeyListenerDe.java
│   ├── MyDemo.java
│   └── uu.png
│
├── Threads/
│   └── multiThreads.java
│
├── Database/
│   ├── InsertIntoEmployeeTable.java
│   └── SelectAllEmployee.java
│
├── Packages/
│   ├── MyPackage/
│   │   └── packageDemo.java
│   └── MyOtherPackage/
│       └── Person.java
└── readme.md
```

---

## 🧠 New Learning Sections

## 📦 1. Getting Started with Java(New!)

Before jumping into the code:

**✅ Install Java Development Kit (JDK) on your system.**

🔗 [JDK Download Link](https://www.oracle.com/java/technologies/javase-download.html)

**✅ Use an IDE:**

Try VS Code, IntelliJ IDEA, or Eclipse for a better coding experience.

>💡 VS Code is lightweight and beginner-friendly.

**✅ Check Java version:**
```
java -version
```

This will display the Java version installed on your system.

📄 `Hello.java`
```
public class Hello{
   public static void main(String[] args) {
      System.out.println("Hello, World!");
      }
}
```

---

## 📘 2. Core Topics & Program Mapping

## 📝 Program List & Concepts

| File Name                        | Concept Demonstrated                                   |
|-----------------------------------|-------------------------------------------------------|
| `greatsmall.java`                | Find greatest and smallest number from user input     |
| `arrayAddition.java`              | Add two 2D arrays entered by user                     |
| `factorial.java`                  | Calculate factorial of a number                       |
| `fibonacci.java`                  | Display Fibonacci series up to N terms                |
| `constructorOverloading.java`     | Demonstrate constructor overloading                   |
| `methodOverloading.java`          | Demonstrate method overloading                        |
| `inheritance.java`                | Inheritance with Shape, Triangle, Rectangle, Square   |
| `abstractClass.java`              | Abstract class and method example                     |
| `interfaces.java`                 | Using interfaces for Area and Perimeter               |
| `stackDataStruture.java`          | Stack data structure implementation                   |
| `Exceptions.java`                 | Exception handling (Arithmetic, Array Out of Bounds)  |
| `throwAndthrows.java`             | Use of `throw` and `throws` in exception handling     |
| `sortString.java`                 | Sort words in a string alphabetically                 |
| `multiThreads.java`               | Create and run multiple threads                       |
| `readWriteByteStream.java`        | Read/write byte streams to a file                     |
| `readWriteCharacterStream.java`   | Read/write character streams to a file                |
| `wrapperClass.java`               | Use of wrapper classes and autoboxing/unboxing        |
| `userDefinedMapAndArraylist.java` | Store user-defined objects in ArrayList and Map       |
| `sortReverseSearch.java`          | Use Collections: sort, reverse, search                |
| `Sw_image.java`                   | Display image and caption using Swing (`uu.png`)      |
| `ArithmeticOperation.java`        | GUI for arithmetic operations (add, sub, mul, div)    |
| `KeyListenerDe.java`              | Key listener events in Swing                          |
| `InsertIntoEmployeeTable.java`    | JDBC: Insert data into employee table                 |
| `SelectAllEmployee.java`          | JDBC: Select all data from employee table             |
| `MyDemo.java`                     | Simple Swing GUI example                              |
| `MyPackage/packageDemo.java`      | Java package usage example                            |
| `MyOtherPackage/Person.java`      | User-defined class for package demo                   |
| `output.txt`, `output1.txt`       | Output files for stream examples                      |
| `uu.png`                          | Image file for GUI demo                               |

---

## 🔧 3. New Use Case Ideas (For Practice)
🧪 Try these mini-projects:
- **📊 Build a Student Report Card system** using Student. java , arrays, and file writing.
- **💬 Create a Chat-like GUI** using swing + Threads .
- **💰 Generate Salary Slips** using the Employee. java class and GUI.
- **📁 Export Data to File** (CSV format) using ArrayList + file Stream.
- **📚 Build a small Library System** using Book. java , collections, and file I/0.

---

## 4. Sample Class: Student.java(Bonus Content)
```
public class Student {
   String name;
   int rollNo;
   double marks;

   public Student(String name, int rollNo, double marks){
      this.name = name;
      this.rollNo = rollNo;
      this.marks = marks;
   }

   public void display(){
      System.out.println("Name: " + name);
      System.out.println("Roll No: " + rollNo);
      System.out.println("Marks: " + marks);
   }

   public static void main (String[] args) {
      Student s1 = new Student("John", 101, 89.5);
      s1.display();
   }
}
```
**Try modifying it:**
- Add grades, age, address
- Save data to file
- Load list of students using ArrayList
  
---
