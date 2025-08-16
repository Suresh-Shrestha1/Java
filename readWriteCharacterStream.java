// 17) Write a program in java to read and write character streams.

import java.io.*;
public class readWriteCharacterStream {
    public static void main(String[] args) {
        String data = "This is the first line of the character stream example.";
        String data1 = "Hello, this is a character stream example!";
        String filename = "output1.txt";

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
            writer.newLine(); // Add a new line
            writer.write(data1);
        } 
        catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e);
        }
    }
}
