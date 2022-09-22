/* 6. Complete the following program using the concept of interface */

/*
* author: @pray3m
*/

class Bicycle {
    int speed;
    int gear;

    public void changeGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Bike extends Bicycle{
}

public class BikeMethods {
    public static void main (String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(3);
        bicycle.speedUp(34);
        bicycle.applyBrakes(12);
        System.out.println("Bicycle present state: ");
        bicycle.printStates();

        Bike bike=new Bike();
        bike.speedUp(56);
        bike.changeGear(2);
        bike.applyBrakes(22);
        System.out.println("Bike present state:");
        bike.printStates();
    }
}