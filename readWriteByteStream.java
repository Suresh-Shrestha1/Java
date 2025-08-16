// 16) Write a program in java to read and write a byte stream.

import java.io.*;

public class readWriteByteStream {
    public static void main(String[] args) {
        String data = "Hello, this is a byte stream example!";
        String filename = "output.txt";

        // Write to file
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filename))) {
            bos.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }

        // Read from file
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename))) {
            int byteData;
            System.out.println("Reading from the file:");
            while ((byteData = bis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e);
        }
    }
}
