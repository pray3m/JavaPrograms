import javax.swing.*;
import java.awt.*;
public class form {
    public static void main(String[] args) {
        JFrame f=new JFrame("Registration");

        JLabel lHeader=new JLabel("STUDENT'S REGISTRATION FORM");
        lHeader.setBounds(200,20,300,30);
        f.add(lHeader);

        JLabel lName= new JLabel("Name : ");
        lName.setBounds(100,60,100,30);
        f.add(lName);

        JTextField tName=new JTextField(100);
        tName.setBounds(200,60,300,30);
        f.add(tName);

        JLabel lAge=new JLabel("Age : ");
        lAge.setBounds(100,100,100,30);
        f.add(lAge);

        /* JTextField tAge=new JTextField(80);
        tAge.setBounds(300,100,100,30);
        f.add(tAge);
         */
        String age[]={"17","18","19","20","21"};
        JComboBox cAge=new JComboBox(age);
        cAge.setBounds(200,100,300,30);
        f.add(cAge);

        JLabel lGender=new JLabel("Gender : ");
        lGender.setBounds(100,140,100,30);
        f.add(lGender);

        JRadioButton rMale=new JRadioButton("Male");
        rMale.setBounds(200,140,100,30);
        f.add(rMale);

        JRadioButton rFemale=new JRadioButton("Female");
        rFemale.setBounds(300,140,100,30);
        f.add(rFemale);

        JRadioButton rOthers=new JRadioButton("Others");
        rOthers.setBounds(400,140,100,30);
        f.add(rOthers);

        JLabel lHobbies = new JLabel("Hobbies : ");
        lHobbies.setBounds(100,180,100,30);
        f.add(lHobbies);

        JCheckBox cb1=new JCheckBox("Playing");
        cb1.setBounds(200,180,100,30);
        f.add(cb1);

        JCheckBox cb2=new JCheckBox("Singing");
        cb2.setBounds(300,180,100,30);
        f.add(cb2);

        JCheckBox cb3=new JCheckBox("Coding");
        cb3.setBounds(400,180,100,30);
        f.add(cb3);

        JLabel lCountries =new JLabel("Countries : ");
        lCountries.setBounds(100,220,100,30);
        f.add(lCountries);

        String [] countries={"Nepal","India","USA","England"};
        JComboBox tb=new JComboBox(countries);
        tb.setBounds(200,220,300,30);
        f.add(tb);

        JLabel lComments =new JLabel("Comments : ");
        lComments.setBounds(100,260,100,30);
        f.add(lComments);

        JTextArea tComments=new JTextArea();
        tComments.setBounds(200,260,300,90);
        f.add(tComments);

        JButton btn1=new JButton("SUBMIT");
        JButton btn2=new JButton("CANCEL");
        btn1.setBounds(220,400,100,30);
        btn2.setBounds(380,400,100,30);
        f.add(btn1);
        f.add(btn2);

        f.setLayout(null);
        f.setSize(600,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
