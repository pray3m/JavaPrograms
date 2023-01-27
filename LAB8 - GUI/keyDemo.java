import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class keyDemo extends JFrame implements KeyListener{
    JLabel l;
    JTextArea ta;
    keyDemo(){
        l=new JLabel("Key here");
        ta=new JTextArea();
        l.setBounds(70,70,150,30);
        ta.setBounds(30,120,150,30);
        add(l);
        add(ta);
        ta.addKeyListener(this);
        setSize(500,500);
        setTitle("Key Example");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        keyDemo k=new keyDemo();
    }

    public void keyTyped(KeyEvent ke){
        l.setText("Key Typed !☺ ");
    }

    public void keyPressed(KeyEvent ke){
        l.setText("Key Pressed ! ☻");
    }

    public void keyReleased(KeyEvent ke){
        l.setText("key Released ! ☹");
    }
}
