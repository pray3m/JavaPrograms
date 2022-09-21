/* 7.  Multiple inheritance in JAVA using Interface */

/*
 * author: @pray3m
 */

interface Writeable{
    void writes();
}

interface Readable{
    void reads();
}

class Student implements Writeable,Readable{
    public void reads(){
        System.out.println("Student reads!");
    }

    public void writes(){
        System.out.println("Student writes!");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.reads();
        s1.writes();
    }
}
