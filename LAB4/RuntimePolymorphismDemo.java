/* 11. Complete the program in java that demonstrate the concepts of method overriding and run
  time polymorphism. */
  
class Bank{
    float getRateOfInterest(){
        return 0;
    }
}

class NICASIA extends Bank{
    float getRateOfInterest() {
        return 8.4f;
    }
}

class PRABHU extends Bank{
    float getRateOfInterest() {
        return 7.3f;
    }
}

class MEGA extends Bank{
    float getRateOfInterest() {
        return 9.5f;
    }
}

public class RuntimePolymorphismDemo{
    public static void main(String[] args){
        Bank a=new NICASIA();
        Bank b=new PRABHU();
        Bank c=new MEGA();
        System.out.println("NICASIA Rate of Interest: "+a.getRateOfInterest());
        System.out.println("PRABHU Rate of Interest: "+b.getRateOfInterest());
        System.out.println("MEGA Rate of Interest: "+c.getRateOfInterest());
    }
}