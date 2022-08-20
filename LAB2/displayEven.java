//Q.N-9 Write a Java program to display all the even numbers from 1 to 500

public class displayEven {
    public static void main(String[] args){
        for(int i=1;i<=500;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
