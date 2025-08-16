// 23) Write a program to demonstrate the key Listener(Key Pressed, Key Typed and Key Release).
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyListenerDe extends JFrame implements KeyListener{
    JLabel KeyInfo;
    public KeyListenerDe(){
        setTitle("Key Listener Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        KeyInfo = new JLabel("Press any key...", JLabel.CENTER);
        add(KeyInfo);
        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        KeyInfo.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }
    @Override
    public void keyReleased(KeyEvent e) {
        KeyInfo.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }
    @Override
    public void keyTyped(KeyEvent e) {
        KeyInfo.setText("Key Typed: " + e.getKeyChar());
    }
    public static void main(String[] args) {
        new KeyListenerDe();
    }
}