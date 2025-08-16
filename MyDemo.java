import javax.swing.*;  
import java.awt.event.*;  

public class MyDemo {  
    public static void main(String[] args) {  
        // Create a new frame
        JFrame frame = new JFrame("Swing JFrame Example");  

        // Create a label
        JLabel label = new JLabel("Hello, Swing!");  
        label.setBounds(100, 50, 200, 30);  

        // Create a button
        JButton button = new JButton("Click Me");  
        button.setBounds(100, 100, 100, 30);  

        // Add action listener to the button
        // button.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         label.setText("Button Clicked!");
        //     }
        // });

        // Add components to the frame
        frame.add(label);  
        frame.add(button);  

        // Set frame properties
        frame.setSize(300, 200);  
        frame.setLayout(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}
