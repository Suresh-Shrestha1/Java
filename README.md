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

## 🛠️ 5. Compilation & Execution Tips

### ✅ PART 1. Compiling Java Programs
To compile a Java program, you can use the `javac` command in the terminal. Here's an :

1. **🔧 Compile the Java file:**
   ```
   javac FileName.java
   ```
2. **▶️ Run the compiled class:**
   ```
   java FileName
   ```
   🧪 Example:
   ```
   javac factorial.java
   java factorial
   ```

---

### ✅ PART 2: Compiling & Running Java with Packages

### 📁 Example Project Structure:

```
JAVA_CLASS/
│
├── myPackage/
│   └── packageDemo.java
│
└── myOtherPackage/
    └── Person.java
```

### 🧾 Step 1: Declare Packages Inside Java Files

`packageDemo.java`
```java
package myPackage;
import myOtherPackage.Person;

public class packageDemo {
    public static void main(String[] args) {
        System.out.println("This is a package demo!");
        Person p = new Person();
        p.show();
    }
}
```

`Person.java`
```java
package myOtherPackage;

public class Person {
    public void show() {
        System.out.println("Hello from Person class in myOtherPackage!");
    }
}
```

### 🧪 Step 2: Compile Java Files with Package Structure

From the JAVA_CLASS/ directory:
```
javac -d . myPackage/packageDemo.java myOtherPackage/Person.java
```

**✅ This will:**

- Compile both files.
- Create folders myPackage/ and myOtherPackage/ (if not present).
- Place .class files in the right folders.

### ▶️ Step 3: Run the Main Class

From the root folder (JAVA_CLASS/):
```
java myPackage.packageDemo
```
>💡 Note: Run using fully qualified class name: packageName.className

>💡 Note: The package name is case-sensitive.

---

### ✅ PART 3: SQL Setup for JDBC Programs (MySQL)

You mentioned files like:
- InsertIntoEmployeeTable.java
- SelectAllEmployee.java

...will require MySQL setup and a JDBC connector. Here's how to set it up.

### 🐬 Step 1: Install MySQL
1. Download & install:

      🔗 [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
2. Optionally install:

      🛠️ [MySQL Workbench (GUI)](https://dev.mysql.com/downloads/connector/j/)

### 🔗 Step 2: Add MySQL JDBC Driver

1. Download connector:

   🔗 [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

2. Compile and Run (Linux/macOS):
```
javac -cp .:mysql-connector-j-8.4.0.jar InsertIntoEmployeeTable.java
java -cp .:mysql-connector-j-8.4.0.jar InsertIntoEmployeeTable
```

**On Windows (use ;):**
```
javac -cp .;mysql-connector-j-8.4.0.jar InsertIntoEmployeeTable.java
java -cp .;mysql-connector-j-8.4.0.jar InsertIntoEmployeeTable
```
>💡 Note: The path to the JDBC driver may vary depending on your system and MySQL version

### 💾 Step 3: Create Database and Table
```
-- Create DB
CREATE DATABASE java_class;

-- Use DB
USE java_class;

-- Create Table
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

-- Insert Data
INSERT INTO employee VALUES 
(1, 'Alice', 'HR', 55000),
(2, 'Bob', 'IT', 65000),
(3, 'Charlie', 'Finance', 60000);
```

**🔌 Sample JDBC Connection and Insert Code**
```
import java.sql.*;

public class InsertIntoEmployeeTable {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java_class", "root", "your_password"
            );
            
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO employee VALUES (4, 'David', 'Marketing', 58000)";
            int result = stmt.executeUpdate(sql);

            if (result > 0)
                System.out.println("Data inserted successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
```

**✅ Replace:**
- "your_password" with your actual MySQL password
- Ensure MySQL server is running!

---
