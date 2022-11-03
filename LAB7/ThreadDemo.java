/* 1. Use the concept of creating thread by extending the Thread class to convert the following
program that prints the output in the interval of 1 second.*/

class Hi extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("HI - " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[]args){
        Hi obj=new Hi();
        obj.start();
    }
}
