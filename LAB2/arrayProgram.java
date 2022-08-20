// Q.N-22. Create a new Java program called ArrayProgram.

public class arrayProgram {
    public static void main(String[] args){

        //Declare and create an array newNumbers which can contain 12 int numbers
        //int newNumbers[] = new int[12];

        //Assign these values into newNumbers 10, 6, 88, 91, 25, 77, 14, 23 ,4, 235, 66, 81.
        int[] newNumbers ={10,6,88,91,25,77,14,23,4,235,66,81};

        //Find and display the length of the array
        System.out.println("The length of array is "+newNumbers.length);

        //Display the value stored in the 5th element of the array
        System.out.println("The value stored in the 5th element of the array is " + newNumbers[4]);

        //Change the value in the 5th element to 35. Display again
        newNumbers[4]=35;
        System.out.println("The value in the 5th element is changed is "+newNumbers[4]);

        //Calculate and display the average of the values stored in the array (use the length
        //attribute)
        int sum=0;
        for(int i=0;i<newNumbers.length;i++){
            sum+=newNumbers[i];
        }
        System.out.println("The average of the array is " + sum/newNumbers.length);
    }
}
