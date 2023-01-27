import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventDemo extends JFrame implements ActionListener {
    JButton b;
    JTextField tf;

    EventDemo(){
        b=new JButton("Click Me");
        tf=new JTextField(20);
        b.setBounds(20,80,120,30);
        tf.setBounds(30, 40,260,30);
        add(b);
        add(tf);;
        b.addActionListener(this);
        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        EventDemo ed=new EventDemo();
    }
}
