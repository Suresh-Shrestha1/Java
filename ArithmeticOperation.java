// 22) Write a program to demonstrate event handling that performs arithmetic operations(addition, subtraction, multiplication, division).

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class ArithmeticOperation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arithmetic Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setLayout(new FlowLayout());

        // Create labels and text fields for input
        JLabel num1label = new JLabel("Number 1:");
        frame.add(num1label);
        JTextField num1Field = new JTextField(10);
        frame.add(num1Field);

        JLabel num2label = new JLabel("Number 2:");
        frame.add(num2label);
        JTextField num2Field = new JTextField(10);
        frame.add(num2Field);

        // Create buttons for arithmetic operations
        JButton addButton = new JButton("Add");
        frame.add(addButton);
        JButton subButton = new JButton("Subtract");
        frame.add(subButton);
        JButton mulButton = new JButton("Multiply");
        frame.add(mulButton);
        JButton divButton = new JButton("Divide");
        frame.add(divButton);
        JLabel resultLabel = new JLabel("Result: ");
        frame.add(resultLabel);

        //Anonymous inner classes for adding button actions
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                }
                catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        // Anonymous inner classes for subtracting button actions
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int diff = num1 - num2;
                    resultLabel.setText("Result: " + diff);
                }
                catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        // Anonymous inner classes for multiplying button actions
        mulButton.addActionListener(e-> {
            try{
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int mul = num1 * num2;
                resultLabel.setText("Result: " + mul);
            }
            catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
            }
        });
        
        // Anonymous inner classes for dividing button actions
        divButton.addActionListener(e-> {
            try{
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                if (num2 == 0) {
                    resultLabel.setText("Cannot divide by zero");
                } 
                else {
                    double div = (double) num1 / num2;
                    resultLabel.setText("Result: " + div);
                }
            }
            catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}

// import javax.swing.*;
// import java.awt.event.*;
// import java.awt.FlowLayout;

// public class ArithmeticOperation {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Arithmetic Operations");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(200, 200);
//         frame.setLayout(new FlowLayout());

//         JLabel num1label = new JLabel("Number 1:");
//         frame.add(num1label);
//         JTextField num1Field = new JTextField(10);
//         frame.add(num1Field);

//         JLabel num2label = new JLabel("Number 2:");
//         frame.add(num2label);
//         JTextField num2Field = new JTextField(10);
//         frame.add(num2Field);

//         JButton addButton = new JButton("Add");
//         JButton subButton = new JButton("Subtract");
//         JButton mulButton = new JButton("Multiply");
//         JButton divButton = new JButton("Divide");

//         frame.add(addButton);
//         frame.add(subButton);
//         frame.add(mulButton);
//         frame.add(divButton);

//         JLabel resultLabel = new JLabel("Result: ");
//         frame.add(resultLabel);

//         // Common handler for arithmetic operations
//         ActionListener handler = e -> {
//             try {
//                 int num1 = Integer.parseInt(num1Field.getText());
//                 int num2 = Integer.parseInt(num2Field.getText());
//                 Object source = e.getSource();

//                 if (source == addButton) {
//                     resultLabel.setText("Result: " + (num1 + num2));
//                 } else if (source == subButton) {
//                     resultLabel.setText("Result: " + (num1 - num2));
//                 } else if (source == mulButton) {
//                     resultLabel.setText("Result: " + (num1 * num2));
//                 } else if (source == divButton) {
//                     if (num2 == 0) {
//                         resultLabel.setText("Cannot divide by zero");
//                     } else {
//                         resultLabel.setText("Result: " + ((double) num1 / num2));
//                     }
//                 }
//             } 
//             catch (NumberFormatException ex) {
//                 resultLabel.setText("Invalid input");
//             }
//         };

//         // Register common handler to all buttons
//         addButton.addActionListener(handler);
//         subButton.addActionListener(handler);
//         mulButton.addActionListener(handler);
//         divButton.addActionListener(handler);

//         frame.setVisible(true);
//     }
// }
