import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EventDemoo extends JFrame implements ActionListener {
    JButton b;
    JLabel l;
    int count=0;
    EventDemoo(){
        b=new JButton("Click Here");
        l=new JLabel();
        b.setBounds(20,80,120,30);
        l.setBounds(30, 40,260,30);
        add(b);
        add(l);;
        b.addActionListener(this);
        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        l.setText(String.valueOf(++count));
    }

    public static void main(String[] args) {
        EventDemoo ed=new EventDemoo();
    }
}
