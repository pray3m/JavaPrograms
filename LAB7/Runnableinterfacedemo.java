/*  6. Create two classes ThreadA and ThreadB which implements Runnable interface. ThreadA
displays all even numbers from 50 to 100 and Thread B displays all odd numbers from 100 to
200. Define a main class which creates the objects of the both the classes and displays the
numbers as per the above mentioned specifications. */

class ThreadA implements Runnable{
    public void run(){
        for(int i=50;i<=100;i++){
            if(i%2==0){
                System.out.println("even no ="+i);
            }
        }
    }
}
class ThreadB implements Runnable{
    @Override
    public void run() {
        for(int j=100;j<=200;j++){
            if(j%2==0){
                System.out.println("Odd no="+j);
            }
        }
    }
}
public class RunnableInterfaceDemo {
    public static void main(String[] args){
        ThreadA a=new ThreadA();
        Thread d=new Thread(a);
        ThreadB b= new ThreadB();
        Thread e= new Thread(b);
        d.start();
        e.start();
    }
}
