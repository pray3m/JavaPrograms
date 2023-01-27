import java.swing.*;
import java.awt.*;

public class GUIDemo{
    public static void main(String[] args){

        
        JFrame f=new JFrame('Registration');
        
        JLabel lHeader=new JLabel("Student Registration");
        lHeader.setBounds(260,10,120,20);
        f.add(lHeader);
        
        JLabel lName = new JLabel("Name:");
        lName.setBounds(30,50,70,10);
        f.add(lName);
        
        JTextField tName=new JTextField();
        tName.setBounds(100,45,120,20);
        f.add(tName);
        
        String[] age={"17","18","19","20"};
        JLabel lAge= new JLabel("Age");
        lAge.setBounds(30,80,70,20);
        f.add(lAge);
        
        JcomboBox cAge=new JcomboBox(age);
        cAge.setBounds(100,100,70,20);
        f.add(
            
        )
        
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}