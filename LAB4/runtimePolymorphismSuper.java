/* 12. Complete the program to demonstrate the concept of run time polymorphism using super
keyword. */

class Company {
    public void address() {
        System.out.println("This is Address of my Company...");
    }
}

class eBay extends Company {
    public void address() {
        super.address(); // invokes the super class method
        System.out.println("This is eBay's Address...");
    }
}

public class runtimePolymorphismSuper {
    public static void main(String[] args) {
        Company a = new Company(); // Company reference and object
        Company b = new eBay(); // Company reference but eBay object
        a.address();// runs the method in Company class
        b.address();// Runs the method in eBay class
    }
}