/*  5. Make a thread using runnable interface to display number from 1 to 20; each number should
be displayed in the interval of 20 seconds.*/

class i implements Runnable{
    public void run() {
        for(int i=1;i<=20;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Runnableinterface {
    public static void main(String[] args) {
        i t = new i();
        Thread a = new Thread(t);
        a.start();


    }

}







