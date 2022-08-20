// Q.N-2 Find the error in the program and complete the following program.

public class light {
    public static void main(String[] args){
        int lightSpeed=186000;
        long days=1000;
        long seconds;
        seconds=days*24*60*60;
        long distance;
        distance=lightSpeed*seconds;
        System.out.println("In "+ days+ " days light will travel about " + distance + " miles.");
    }
}
