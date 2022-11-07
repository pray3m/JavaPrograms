/* 3. Use the concept of creating thread by implementing the Runnable interface to convert the
above program and prints the output in the interval of 1 second */

class m implements Runnable{
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Threadinterval {
    public static void main(String[] args) {
        m t = new m();
        Thread a = new Thread(t);
        a.start();


    }

}
