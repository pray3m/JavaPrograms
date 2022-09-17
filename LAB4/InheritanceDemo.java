/*5. Create a class student with instance variables roll_no and two methods to read and display the
roll_no. Then create another class Test that inherits class student, consisting of its own instance
variables to hold the marks of two subjects and also methods to read and display the marks.
Finally, create another class Result which inherits class Test. It also has its own instance variable
total to hold the total of two marks scored by the student. Similarly, it has methods to calculate
and display the total. Create some instance of above classes and demonstrate inheritance. */

/*
 * author: @pray3m
 */

class Student{
    int rollNo;
    Student(int rollNo){
        this.rollNo=rollNo;
    }

    void display(){
        System.out.println("Roll No: "+rollNo);
    }
}

class Test extends Student{
    int marks1,marks2;

    Test(int roll,int marks1,int marks2){
        super(roll);
        this.marks1=marks1;
        this.marks2=marks2;
    }

    void displayMarks(){
        System.out.printf("The marks \n\t Sub 1 :%d \n\t Sub 2 : %d",marks1,marks2);
    }
}

class Result extends Test{
    int total=0;

    Result(int roll,int marks1, int marks2){
        super(roll, marks1, marks2);
        total=marks1+marks2;
    }

    int calcTotal(){
        return total;
    }

    void displayResult(){
        super.display();
        super.displayMarks();
        System.out.println("\n The total marks is: "+total);
    }
}


public class InheritanceDemo{
    public static void main(String[] args) {
        Result s1=new Result(1,56,76);
        s1.displayResult();
    }
}


