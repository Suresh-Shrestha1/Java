// 21) Write a program to demontrate image and image caption using Swing.

import javax.swing.*;
// import java.awt.*;
public class Sw_image {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Image and Image Caption Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 750);

        // Create an ImageIcon
        ImageIcon icon = new ImageIcon("uu.png"); 

        // Create a JLabel and set the icon
        JLabel label = new JLabel(icon);
        label.setText("This is an image caption");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setBounds(50, 50, 300, 300); // Set bounds for the label

        // // Set the font and color for the label text using awt
        // label.setForeground(Color.RED);
        // Font font = new Font("Arial", Font.BOLD, 16);
        // label.setFont(font);
        
        // Add the label to the frame
        frame.add(label);
        
        // Set the frame to be visible
        frame.setVisible(true);
    }
}
