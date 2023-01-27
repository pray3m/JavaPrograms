import javax.swing.*;
import java.awt.event.*;

public class mouseDemo extends JFrame implements MouseListener{
    JLabel l;
    JTextArea ta;
    mouseDemo(){
        l=new JLabel("Mouse here");
        ta=new JTextArea();
        l.setBounds(70,70,150,30);
        ta.setBounds(30,120,350,80);
        add(l);
        add(ta);
        ta.addMouseListener(this);
        setSize(500,500);
        setTitle("Mouse Events Example");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        mouseDemo m=new mouseDemo();
    }

    public void mouseClicked(MouseEvent me){
        l.setText("Mouse Clicked !☺ ");
    }

    public void mouseEntered(MouseEvent me){
        l.setText("Mouse Entered ! ☻");
    }

    public void mouseExited(MouseEvent me){
        l.setText("Mouse Exited ! ☹");
    }


    public void mousePressed(MouseEvent me){
        l.setText("Mouse Pressed ! ☹");
    }


    public void mouseReleased(MouseEvent me){
        l.setText("Mouse Released ! ☹");
    }
}
