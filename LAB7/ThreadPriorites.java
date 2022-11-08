 /* 4. Run the following program and learn the concept of thread priority. */

class myThread extends Thread{
    public void run() { 
        System.out.println("Inside run method"); 
    }
}

public class ThreadPriorites {
    public static void main(String[] args) {
        myThread t1 = new myThread(); 
        myThread t2 = new myThread(); 
        myThread t3 = new myThread(); 

        System.out.println("t1 thread priority : " + t1.getPriority()); // Default 5 
        System.out.println("t2 thread priority : " + t2.getPriority()); // Default 5 
        System.out.println("t3 thread priority : " + t3.getPriority()); // Default 5 
        
        t1.setPriority(2); 
        t2.setPriority(5); 
        t3.setPriority(8);

        // t3.setPriority(21); will throw IllegalArgumentException 
        System.out.println("t1 thread priority : " + t1.getPriority()); //2 
        System.out.println("t2 thread priority : " + t2.getPriority()); //5 
        System.out.println("t3 thread priority : " + t3.getPriority());//8 
        
        // Main thread 
        System.out.print(Thread.currentThread().getName()); 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 
        
        // Main thread priority is set to 10 
        Thread.currentThread().setPriority(10); 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 
    }
}