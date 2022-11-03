/* 2. Write a java program to show the inter-thread communication.(Use both concept of creating a
thread by using Thread class and Runnable interface).*/


class my implements Runnable{
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("hello");
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[]args){
        my t= new my();
        Thread a=new Thread(t);
        a.start();
    }
}
